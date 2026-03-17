package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap4 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 40.0; // Масштаб: 1 бірлік = 40 пиксель

        // Осьтерді сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2f));

        // Графикті салу (нүкте-нүкте бойынша)
        Integer prevX = null;
        Integer prevY = null;

        for (double x = -10; x <= 10; x += 0.1) {
            // Функция: y = x^3 + 2x^2 + x
            double y = Math.pow(x, 3) + 2 * Math.pow(x, 2) + x;

            // Координаталарды экран нүктелеріне айналдыру
            int screenX = (int) (centerX + x * scale);
            int screenY = (int) (centerY - y * scale);

            if (prevX != null && screenY > 0 && screenY < height) {
                g2.drawLine(prevX, prevY, screenX, screenY);
            }

            prevX = screenX;
            prevY = screenY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("y = x^3 + 2x^2 + x графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap4());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}