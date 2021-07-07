import javax.swing.*;

class TTT_GUI{
    public static void main(String args[]){
       JFrame frame = new JFrame("Tic Tac Toe");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       frame.setLayout(null);
       frame.setVisible(true);
     }
}
    public static void button(x,y,w,l){

      for (int x = 130, x = 330, x += 100 ){
        for (int y = 100, y = 180, y += 40){
          JButton b = new JButton("x");
          b.setBounds(x,y,100,40);
          frame.add(b);
        }
    }
}
