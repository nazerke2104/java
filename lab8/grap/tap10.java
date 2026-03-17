package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap10 extends JPanel {

    // График параметрлері
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final double SCALE = 40.0; // 1 бірлік = 40 пиксель

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Координаталар жүйесін ортаға жылжыту
        g2.translate(WIDTH / 2, HEIGHT / 2);

        // Осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(-WIDTH / 2, 0, WIDTH / 2, 0); // X осі
        g2.drawLine(0, -HEIGHT / 2, 0, HEIGHT / 2); // Y осі

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));

        // Графикті екі бөлікке бөліп сызамыз (өйткені x = 0 нүктесінде үзіліс бар)
        drawHalfGraph(g2, -10.0, -0.1); // Сол жағы (x < 0)
        drawHalfGraph(g2, 0.1, 10.0);   // Оң жағы (x > 0)

        g2.setColor(Color.BLUE);
        g2.drawString("y = 3 + 2/x + 3/x^2", 150, -200);
    }

    private void drawHalfGraph(Graphics2D g2, double startX, double endX) {
        Path2D path = new Path2D.Double();
        boolean first = true;

        for (double x = startX; x <= endX; x += 0.05) {
            // Функция: y = 3 + 2/x + 3/x^2
            double y = 3 + (2 / x) + (3 / (x * x));

            // Экрандағы координаталар (Y осі теріс бағытта өсетіндіктен минус қойылады)
            double screenX = x * SCALE;
            double screenY = -y * SCALE;

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
        JFrame frame = new JFrame("Функция графигі - 10 тапсырма");
        tap10 panel = new tap10();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}