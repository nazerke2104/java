package MyGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class tap20 extends JPanel {

    // Масштабтау коэффициенттері
    private double scale = 40;
    private int width = 800;
    private int height = 600;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Координаталар жүйесін ортаға жылжыту
        g2.translate(width / 2, height / 2);

        // Осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(-width / 2, 0, width / 2, 0); // X осі
        g2.drawLine(0, -height / 2, 0, height / 2); // Y осі

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));

        Path2D path = new Path2D.Double();
        boolean firstPoint = true;

        // Графикті салу (x мәндері бойынша жүру)
        for (double x = -10; x <= 10; x += 0.01) {
            double denominator = x * x - 5;

            // Анықталу облысын тексеру (нөлге бөлінбеуі керек)
            if (Math.abs(denominator) > 0.1) {
                double y = (3 * x) / denominator;

                // Экрандағы координаталар (Y осі Java-да төмен қарай бағытталғандықтан теріс мән аламыз)
                double screenX = x * scale;
                double screenY = -y * scale;

                if (firstPoint || Math.abs(y) > 20) {
                    path.moveTo(screenX, screenY);
                    firstPoint = false;
                } else {
                    path.lineTo(screenX, screenY);
                }
            } else {
                firstPoint = true; // Үзіліс нүктесінде сызықты тоқтату
            }
        }
        g2.draw(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Функция графигі: y = 3x / (x^2 - 5)");
        tap20 panel = new tap20();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}