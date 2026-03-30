import javax.swing.*;
import java.awt.*;

public class tap6 extends JPanel{

    int x=50,y=50;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x,y,40,40);
    }

    public static void main(String[] args){

        JFrame f=new JFrame("Есеп 5");
        tap6 p=new tap6();

        JTextField tx=new JTextField();
        JTextField ty=new JTextField();
        JButton b=new JButton("Draw");

        JPanel panel=new JPanel();

        panel.add(tx);
        panel.add(ty);
        panel.add(b);

        b.addActionListener(e->{
            p.x=Integer.parseInt(tx.getText());
            p.y=Integer.parseInt(ty.getText());
            p.repaint();
        });

        f.add(p);
        f.add(panel,BorderLayout.SOUTH);

        f.setSize(400,300);
        f.setVisible(true);
    }
}