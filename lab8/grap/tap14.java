package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap14 extends JPanel {

    // Функцияның анықталу облысын есептеу және мәнін қайтару
    // y = 1 / (x^2 + 3x + 1)
    private double calculateY(double x) {
        double denominator = x * x + 3 * x + 1;

        // Бөлімі нөлге тең болмауы керек (Анықталу облысы)
        if (Math.abs(denominator) < 0.001) {
            return Double.NaN;
        }
        return 1.0 / denominator;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 50.0; // Масштаб

        // Координаттар жүйесін сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2));

        // Графикті нүкте бойынша сызу
        boolean firstPoint = true;
        int prevX = 0, prevY = 0;

        for (int i = 0; i < width; i++) {
            double xVal = (i - centerX) / scale;
            double yVal = calculateY(xVal);

            if (!Double.isNaN(yVal)) {
                int screenY = centerY - (int) (yVal * scale);

                if (!firstPoint) {
                    // Асимптоталар кезінде сызықтың секіріп кетпеуін қадағалау
                    if (Math.abs(screenY - prevY) < height) {
                        g2.drawLine(prevX, prevY, i, screenY);
                    }
                }
                prevX = i;
                prevY = screenY;
                firstPoint = false;
            } else {
                firstPoint = true; // Үзіліс нүктесі (асимптота)
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Функция графигі: y = 1 / (x^2 + 3x + 1)");
        tap14 panel = new tap14();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}