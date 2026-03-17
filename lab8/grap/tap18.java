package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap18 extends JPanel {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final double SCALE = 50.0; // 1 бірлік = 50 пиксель

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        // Координаталық осьтерді салу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, WIDTH, centerY);
        g2.drawLine(centerX, 0, centerX, HEIGHT);

        // Функция графигін салу
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2));

        Path2D path = new Path2D.Double();
        boolean firstPoint = true;

        for (int screenX = 0; screenX < WIDTH; screenX++) {
            double x = (screenX - centerX) / SCALE;
            double denominator = x * x + 3 * x + 1;

            // Бөлімі нөлге өте жақын болса, үзіліс жасаймыз
            if (Math.abs(denominator) < 0.01) {
                firstPoint = true;
                continue;
            }

            double y = x / denominator;
            int screenY = centerY - (int) (y * SCALE);

            if (screenY > 0 && screenY < HEIGHT) {
                if (firstPoint) {
                    path.moveTo(screenX, screenY);
                    firstPoint = false;
                } else {
                    path.lineTo(screenX, screenY);
                }
            } else {
                firstPoint = true;
            }
        }
        g2.draw(path);

        // Атауы
        g2.setColor(Color.BLACK);
        g2.drawString("y = x / (x^2 + 3x + 1)", 20, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("18-тапсырма: Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap18());
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}