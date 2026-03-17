package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap7 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Координаталық осьтерді ортаға қою
        g2.drawLine(0, height / 2, width, height / 2); // X осі
        g2.drawLine(width / 2, 0, width / 2, height); // Y осі

        double scale = 40.0; // Масштаб (1 бірлік = 40 пиксель)
        Path2D path = new Path2D.Double();

        boolean firstPoint = true;

        // x мәндерін -10-нан 10-ға дейін есептеу
        for (double x = -10; x <= 10; x += 0.1) {
            // ФУНКЦИЯ: y = cos(x - 1) + |x|
            double y = Math.cos(x - 1) + Math.abs(x);

            // Экрандағы координаталарға айналдыру
            double screenX = width / 2 + x * scale;
            double screenY = height / 2 - y * scale;

            if (firstPoint) {
                path.moveTo(screenX, screenY);
                firstPoint = false;
            } else {
                path.lineTo(screenX, screenY);
            }
        }

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));
        g2.draw(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Функция графигі: y = cos(x-1) + |x|");
        tap7 panel = new tap7();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}