import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap4 extends JPanel {

    Color color=Color.RED;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(100,50,80,80);
    }

    public static void main(String[] args){

        JFrame f=new JFrame("Есеп 4");
        lab10_4 p=new lab10_4();

        JButton b=new JButton("Change");

        b.addActionListener(e->{
            if(p.color==Color.RED) p.color=Color.GREEN;
            else if(p.color==Color.GREEN) p.color=Color.BLUE;
            else p.color=Color.RED;

            p.repaint();
        });

        f.add(p,BorderLayout.CENTER);
        f.add(b,BorderLayout.SOUTH);

        f.setSize(300,250);
        f.setVisible(true);
    }
}