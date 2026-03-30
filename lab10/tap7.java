import javax.swing.*;
import java.awt.event.*;

public class tap7 {

    public static void main(String[] args){

        JFrame f=new JFrame("Есеп 7");
        JLabel l=new JLabel();

        f.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                l.setText("Symbol: "+e.getKeyChar());
            }
        });

        f.add(l);
        f.setSize(300,200);
        f.setVisible(true);
    }
}