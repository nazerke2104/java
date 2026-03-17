package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap19 extends JPanel {

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

        // Координаттар жүйесін сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.RED);

        // Графикті салу нүктелері
        double prevX = -10;
        double prevY = calculateY(prevX);

        for (int i = -width / 2; i < width / 2; i++) {
            double x = i / scale;
            double y = calculateY(x);

            // Анықталмаған нүктелерде (бөлімі 0-ге жақын) сызықты үзу
            if (!Double.isInfinite(y) && !Double.isNaN(y) && Math.abs(y) < 20) {
                int x1 = (int) (centerX + (i - 1));
                int y1 = (int) (centerY - calculateY((i - 1) / scale) * scale);
                int x2 = (int) (centerX + i);
                int y2 = (int) (centerY - y * scale);

                // Үзіліс нүктелерін тексеру (асимптоталар)
                if (Math.abs(y2 - y1) < height) {
                    g2.drawLine(x1, y1, x2, y2);
                }
            }
        }
    }

    // Функцияны есептеу: y = x / (x^2 - 3x + 1)
    private double calculateY(double x) {
        double denominator = x * x - 3 * x + 1;
        if (Math.abs(denominator) < 0.01) return Double.NaN; // Асимптота
        return x / denominator;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Функция графигі: y = x / (x^2 - 3x + 1)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap19());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}