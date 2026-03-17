package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap16 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 50.0; // Масштаб: 1 бірлік = 50 пиксель

        // Координаталық осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        Path2D path = new Path2D.Double();
        boolean firstPoint = true;

        // Графикті салу (x = -1 нүктесін айналып өту керек)
        for (int i = 0; i < width; i++) {
            double x = (i - centerX) / scale;

            // Бөлімі нөлге жуық болса, өткізіп жіберу (асимптота)
            double denominator = Math.pow(x, 2) + 2 * x + 1;
            if (Math.abs(denominator) < 0.01) {
                firstPoint = true;
                continue;
            }

            double y = x / denominator;
            int screenY = centerY - (int) (y * scale);

            if (firstPoint) {
                path.moveTo(i, screenY);
                firstPoint = false;
            } else {
                // График экран шекарасынан шығып кетсе үзіліс жасау
                if (screenY > 0 && screenY < height) {
                    path.lineTo(i, screenY);
                } else {
                    firstPoint = true;
                }
            }
        }
        g2.draw(path);

        g2.setColor(Color.RED);
        g2.drawString("y = x / (x^2 + 2x + 1)", 20, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap16());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}