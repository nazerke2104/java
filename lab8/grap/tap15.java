package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap15 extends JPanel {

    // Функцияны есептеу: y = x / (3x^2 + 2x + 1)
    private double calculateY(double x) {
        return x / (3 * Math.pow(x, 2) + 2 * x + 1);
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
        double scale = 100; // Масштаб (1 бірлік = 100 пиксель)

        // Координаттар осін сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));

        // Графикті нүкте бойынша сызу
        Integer prevX = null;
        Integer prevY = null;

        for (int i = 0; i < width; i++) {
            // Экрандағы x-ті математикалық x-ке айналдыру
            double xMath = (i - centerX) / scale;
            double yMath = calculateY(xMath);

            // Математикалық y-ті экрандағы y-ке айналдыру
            int screenY = (int) (centerY - yMath * scale);

            if (prevX != null) {
                g2.drawLine(prevX, prevY, i, screenY);
            }
            prevX = i;
            prevY = screenY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("№15 Функция графигі");
        tap15 panel = new tap15();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}