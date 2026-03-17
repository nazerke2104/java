package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap3 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int originX = width / 2;
        int originY = height / 2;

        // Координаттар жүйесін (осьтерді) сызу
        g2.drawLine(0, originY, width, originY); // X осі
        g2.drawLine(originX, 0, originX, height); // Y осі

        g2.setColor(Color.RED);

        // Масштаб коэффициенті (график көрінуі үшін)
        double scale = 50.0;

        // Графикті нүктелер арқылы сызу
        for (double x = -5; x <= 5; x += 0.01) {
            // Функция: y = -6x^2 + 3x
            double y = -6 * Math.pow(x, 2) + 3 * x;

            // Экрандағы координаталарға айналдыру
            int screenX = (int) (originX + x * scale);
            int screenY = (int) (originY - y * scale);

            // Нүктені салу
            g2.fillOval(screenX, screenY, 2, 2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("y = -6x^2 + 3x графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap3());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}