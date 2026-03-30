import javax.swing.*;
import java.awt.*;

public class tap9 extends JPanel{

    int x=0;

    public Lab10_9(){
        Timer t=new Timer(50,e->{
            x+=5;
            repaint();
        });
        t.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x,100,40,40);
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Animation");
        f.add(new tap9());
        f.setSize(400,300);
        f.setVisible(true);
    }
}