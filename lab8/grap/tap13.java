package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap13 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 50.0; // Масштаб (1 бірлік = 50 пиксель)

        // Координаттар жүйесін сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.RED);

        // Графикті салу
        boolean firstPoint = true;
        int prevX = 0, prevY = 0;

        for (int i = 0; i < width; i++) {
            // Экрандағы x-ті математикалық x-ке айналдыру
            double x = (i - centerX) / scale;

            // x = -1 нүктесінде үзіліс бар екенін ескеру
            if (Math.abs(x + 1) < 0.05) {
                firstPoint = true;
                continue;
            }

            // Функция: y = 1 / (x^2 + 2x + 1)
            double y = 1.0 / (x * x + 2 * x + 1);

            // Математикалық y-ті экрандағы y-ке айналдыру
            int j = (int) (centerY - y * scale);

            if (!firstPoint) {
                // Тек мәндер экран шегінде болса сызамыз
                if (j > 0 && j < height && prevY > 0 && prevY < height) {
                    g2.drawLine(prevX, prevY, i, j);
                }
            }

            prevX = i;
            prevY = j;
            firstPoint = false;
        }

        g2.setColor(Color.BLUE);
        g2.drawString("y = 1 / (x^2 + 2x + 1)", 20, 20);
        g2.drawString("Анықталу облысы: x ≠ -1", 20, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13-тапсырма: Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap13());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}