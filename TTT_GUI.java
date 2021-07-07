import javax.swing.*;

class TTT_GUI{
    public static void main(String args[]){
       JFrame frame = new JFrame("Tic Tac Toe");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       frame.setLayout(null);

       JButton a = new JButton("1");
       a.setBounds(130,100,100, 40);
       frame.add(a);

       JButton b = new JButton("2");
       b.setBounds(130,140,100, 40);
       frame.add(b);

       JButton c = new JButton("3");
       c.setBounds(130,180,100, 40);
       frame.add(c);

       JButton d = new JButton("4");
       d.setBounds(230,100,100, 40);
       frame.add(d);

       JButton e = new JButton("5");
       e.setBounds(230,140,100, 40);
       frame.add(e);

       JButton f = new JButton("6");
       f.setBounds(230,180,100, 40);
       frame.add(f);

       JButton g = new JButton("7");
       g.setBounds(330,100,100, 40);
       frame.add(g);

       JButton h = new JButton("8");
       h.setBounds(330,140,100, 40);
       frame.add(h);

       JButton i = new JButton("9");
       i.setBounds(330,180,100, 40);
       frame.add(i);

       frame.setVisible(true);
     }
}
