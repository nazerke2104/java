import javax.swing.*;

public class tap3 {

    public static void main(String[] args){

        JFrame f=new JFrame("Есеп 3");

        JTextField t=new JTextField();
        JButton b=new JButton("OK");
        JLabel l=new JLabel();

        f.setLayout(null);

        t.setBounds(50,20,150,30);
        b.setBounds(50,60,100,30);
        l.setBounds(50,100,200,30);

        b.addActionListener(e->
                l.setText("Сәлем, "+t.getText()));

        f.add(t);
        f.add(b);
        f.add(l);

        f.setSize(300,200);
        f.setVisible(true);
    }
}