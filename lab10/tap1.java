import java.awt.*;
import javax.swing.*;

public class tap1 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(20,20,100,60);
        g.drawString("Тіктөртбұрыш",20,15);

        g.drawOval(150,20,60,60);
        g.drawString("Шеңбер",150,15);

        g.drawLine(50,120,200,120);
        g.drawString("Сызық",50,140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("lab10");
        frame.add(new tap1());
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}