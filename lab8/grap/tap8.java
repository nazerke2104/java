package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap8 extends JPanel {

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

        // Координаталық осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));

        // Графикті екі бөлікке бөліп саламыз: x < 0 және x > 0
        drawHyperbolaPart(g2, centerX, centerY, scale, -width / 2.0, -0.1);
        drawHyperbolaPart(g2, centerX, centerY, scale, 0.1, width / 2.0);

        g2.setColor(Color.BLACK);
        g2.drawString("y = 1/x", 20, 20);
    }

    private void drawHyperbolaPart(Graphics2D g2, int cx, int cy, double scale, double startX, double endX) {
        Path2D path = new Path2D.Double();
        boolean first = true;

        for (double x = startX; x <= endX; x += 0.05) {
            if (Math.abs(x) < 0.01) continue; // 0-ге бөлуден сақтану

            double y = 1.0 / x;

            // Экрандағы координаталарға айналдыру
            double screenX = cx + x * scale;
            double screenY = cy - y * scale;

            if (first) {
                path.moveTo(screenX, screenY);
                first = false;
            } else {
                path.lineTo(screenX, screenY);
            }
        }
        g2.draw(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("8-тапсырма: y = 1/x графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap8());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}