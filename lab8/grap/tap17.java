package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap17 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 40.0; // Масштаб

        // Координаттар жүйесін сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        Path2D path = new Path2D.Double();
        boolean firstPoint = true;

        // Функцияны сызу: y = x / (x^2 - 2x + 1)
        for (int i = 0; i < width; i++) {
            double x = (i - centerX) / scale;

            // x = 1 болғанда үзіліс (асимптота)
            if (Math.abs(x - 1.0) < 0.1) {
                firstPoint = true;
                continue;
            }

            double y = x / (Math.pow(x, 2) - 2 * x + 1);
            int screenY = (int) (centerY - y * scale);

            if (screenY > 0 && screenY < height) {
                if (firstPoint) {
                    path.moveTo(i, screenY);
                    firstPoint = false;
                } else {
                    path.lineTo(i, screenY);
                }
            } else {
                firstPoint = true;
            }
        }
        g2.draw(path);

        // Анықталу облысын жазу
        g2.setColor(Color.BLACK);
        g2.drawString("Анықталу облысы: x ≠ 1", 20, 30);
        g2.drawString("Функция: y = x / (x - 1)²", 20, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("17-тапсырма: Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap17());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}