package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap9 extends JPanel {

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

        // Координаталар осін салу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));

        // Графикті салу (екі бөліктен тұрады, өйткені x=2 нүктесінде үзіліс бар)
        drawCurve(g2, centerX, centerY, scale, -10, 1.9); // Сол жақ бөлігі
        drawCurve(g2, centerX, centerY, scale, 2.1, 10);  // Оң жақ бөлігі

        // Асимптотаны белгілеу (x = 2)
        g2.setColor(Color.RED);
        float[] dash = {5f, 5f};
        g2.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10, dash, 0));
        int asympX = (int) (centerX + 2 * scale);
        g2.drawLine(asympX, 0, asympX, height);

        g2.setColor(Color.BLACK);
        g2.drawString("y = (x+3)/(x-2)", 20, 20);
        g2.drawString("Асимптота: x = 2", asympX + 5, 40);
    }

    private void drawCurve(Graphics2D g2, int centerX, int centerY, double scale, double startX, double endX) {
        Path2D path = new Path2D.Double();
        boolean first = true;

        for (double x = startX; x <= endX; x += 0.05) {
            double y = (x + 3) / (x - 2);

            int screenX = (int) (centerX + x * scale);
            int screenY = (int) (centerY - y * scale);

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
        JFrame frame = new JFrame("9-тапсырма: Функция графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap9());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}