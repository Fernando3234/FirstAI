// Your First Program
import java.awt.*;
import javax.swing.*;

class FirstGridD {
    public static void main(String[] args) {
      JFrame f;
      f = new JFrame();

      for(int x = 0; x <= 600; x+=300){
        for(int y = 0; y <= 600; y+=300){
          JButton button = new JButton("click");
          button.setBounds(x,y,300,300);
          f.add(button);
        }
      }

      f.setSize(900,900);
      f.setLayout(null);
      f.setVisible(true);
    }

}
