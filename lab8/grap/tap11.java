package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap11 extends JPanel {

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

        // Координаталар осьтерін салу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2f));

        Integer prevX = null;
        Integer prevY = null;

        // x мәндері бойынша цикл (экранның сол жағынан оң жағына дейін)
        for (int screenX = 0; screenX < width; screenX++) {
            double x = (screenX - centerX) / scale;

            // x = 0 нүктесінде функция анықталмаған (үзіліс)
            if (Math.abs(x) < 0.1) {
                prevX = null;
                prevY = null;
                continue;
            }

            // Функцияны есептеу: y = 3 - 2/x - 3/(x^2)
            double y = 3 - (2 / x) - (3 / Math.pow(x, 2));

            int screenY = (int) (centerY - y * scale);

            // Графиктің нүктелерін біріктіру
            if (prevX != null && screenY > 0 && screenY < height) {
                g2.drawLine(prevX, prevY, screenX, screenY);
            }

            prevX = screenX;
            prevY = screenY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("11-тапсырма: y = 3 - 2/x - 3/x^2");
        tap11 grapher = new tap11();
        frame.add(grapher);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}