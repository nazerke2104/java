import javax.swing.*;

public class tap8 {

    public static void main(String[] args){

        JFrame f=new JFrame("Calculator");

        JTextField a=new JTextField(5);
        JTextField b=new JTextField(5);
        JButton add=new JButton("+");
        JLabel res=new JLabel("Result");

        add.addActionListener(e->{
            int x=Integer.parseInt(a.getText());
            int y=Integer.parseInt(b.getText());
            res.setText("="+(x+y));
        });

        JPanel p=new JPanel();

        p.add(a);
        p.add(b);
        p.add(add);
        p.add(res);

        f.add(p);

        f.setSize(300,200);
        f.setVisible(true);
    }
}