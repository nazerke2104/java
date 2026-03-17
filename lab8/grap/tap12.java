package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap12 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 50; // Масштаб: 1 бірлік = 50 пиксель

        // Координаталық осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));

        // Графикті нүкте бойынша сызу
        Integer prevX = null;
        Integer prevY = null;

        for (int xPixel = 0; xPixel < width; xPixel++) {
            // Пиксельді математикалық x-ке айналдыру
            double x = (xPixel - centerX) / scale;

            // Функция: y = 1 / (3x^2 + 2x + 1)
            double denominator = 3 * x * x + 2 * x + 1;
            double y = 1.0 / denominator;

            // Математикалық y-ті пиксельге айналдыру
            int yPixel = (int) (centerY - y * scale);

            if (prevX != null) {
                g2.drawLine(prevX, prevY, xPixel, yPixel);
            }
            prevX = xPixel;
            prevY = yPixel;
        }

        g2.setColor(Color.BLACK);
        g2.drawString("y = 1 / (3x^2 + 2x + 1)", 20, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("12-тапсырма: Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap12());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}