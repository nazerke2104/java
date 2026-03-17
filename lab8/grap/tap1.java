package grap;

import javax.swing.*;
import java.awt.*;

public class tap1 extends JPanel {

    // Функцияны осы жерде өзгертесің
    double f(double x) {
        return Math.sin(x); // мысал: y = sin(x)
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Осьтер
        g.drawLine(0, height / 2, width, height / 2); // X ось
        g.drawLine(width / 2, 0, width / 2, height); // Y ось

        // График
        for (int i = 0; i < width - 1; i++) {
            double x1 = (i - width / 2) / 50.0;
            double y1 = f(x1);

            double x2 = (i + 1 - width / 2) / 50.0;
            double y2 = f(x2);

            int screenY1 = (int)(height / 2 - y1 * 50);
            int screenY2 = (int)(height / 2 - y2 * 50);

            g.drawLine(i, screenY1, i + 1, screenY2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graph");
        tap1 panel = new tap1();

        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}