package MyGraph;

import javax.swing.*;
import java.awt.*;

public class tap5 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        // Координаттар осін сызу
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        g2.setColor(Color.BLUE);

        // Масштабтау коэффициенті (график жақсы көрінуі үшін)
        double scale = 20.0;

        // Графикті салу
        for (int i = -centerX; i < centerX; i++) {
            double x1 = i / scale;
            double y1 = Math.pow(x1, 5); // y = x^5

            double x2 = (i + 1) / scale;
            double y2 = Math.pow(x2, 5);

            // Экран координаттарына айналдыру
            int screenX1 = centerX + i;
            int screenY1 = centerY - (int) (y1 * scale);
            int screenX2 = centerX + (i + 1);
            int screenY2 = centerY - (int) (y2 * scale);

            // Тек терезе ішіндегі сызықтарды сызу
            if (Math.abs(screenY1) < height * 2 && Math.abs(screenY2) < height * 2) {
                g2.drawLine(screenX1, screenY1, screenX2, screenY2);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("y = x^5 Графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new tap5());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
