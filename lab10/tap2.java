import javax.swing.*;
import java.awt.event.*;

public class tap2 {

    public static void main(String[] args){

        JFrame f=new JFrame("Есеп 2");
        JButton b=new JButton("Бас");
        JLabel l=new JLabel();

        b.addActionListener(e->l.setText("Hello Java"));

        f.setLayout(null);

        b.setBounds(50,30,100,30);
        l.setBounds(50,80,200,30);

        f.add(b);
        f.add(l);

        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}