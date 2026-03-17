package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap2 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Координаттар жүйесінің ортасын анықтау
        int centerX = width / 2;
        int centerY = height / 2;

        // Осьтерді сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.RED);

        // Масштаб (координаттарды экранда көрінетіндей үлкейту)
        double scale = 20.0;

        // Графикті салу (y = 3 * x^2)
        int prevX = 0, prevY = 0;
        boolean first = true;

        for (double x = -10; x <= 10; x += 0.1) {
            double y = 3 * Math.pow(x, 2);

            // Экрандағы пиксель координаты
            int screenX = (int) (centerX + x * scale);
            int screenY = (int) (centerY - y * scale);

            if (!first) {
                g2.drawLine(prevX, prevY, screenX, screenY);
            }

            prevX = screenX;
            prevY = screenY;
            first = false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("y = 3x^2 Графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap2());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}