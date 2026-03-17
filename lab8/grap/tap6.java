package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap6 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Сызықтың сапасын жақсарту (Antialiasing)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        // Координаттар осін сызу (X және Y)
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        // Графиктің түсі мен қалыңдығы
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2f));

        // Графикті нүктелер арқылы құрастыру
        int prevX = 0;
        int prevY = centerY - (int) (Math.sin((double) (0 - centerX) / 20) * 50);

        for (int x = 1; x < width; x++) {
            // Математикалық x мәнін есептеу (масштабтау: /20)
            double mathX = (double) (x - centerX) / 20;
            // Математикалық y мәні (sin)
            double mathY = Math.sin(mathX);

            // Экрандағы y нүктесін есептеу (масштабтау: *50 және ортаға жылжыту)
            int screenY = centerY - (int) (mathY * 50);

            // Алдыңғы нүкте мен қазіргі нүктені сызықпен қосу
            g2.drawLine(prevX, prevY, x, screenY);

            prevX = x;
            prevY = screenY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java-дағы Sin(x) графигі");
        tap6 panel = new tap6();

        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
