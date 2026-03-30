import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap10 extends JPanel{

    Color color=Color.RED;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(100,60,100,100);
    }

    public static void main(String[] args){

        JFrame f=new JFrame("Checkbox");
        tap10 p=new tap10();

        JCheckBox r=new JCheckBox("Red");
        JCheckBox g=new JCheckBox("Green");
        JCheckBox b=new JCheckBox("Blue");

        ItemListener listener=e->{
            if(r.isSelected()) p.color=Color.RED;
            if(g.isSelected()) p.color=Color.GREEN;
            if(b.isSelected()) p.color=Color.BLUE;
            p.repaint();
        };

        r.addItemListener(listener);
        g.addItemListener(listener);
        b.addItemListener(listener);

        JPanel panel=new JPanel();
        panel.add(r);
        panel.add(g);
        panel.add(b);

        f.add(p);
        f.add(panel,BorderLayout.SOUTH);

        f.setSize(400,300);
        f.setVisible(true);
    }
}