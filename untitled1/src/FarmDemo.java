
import javax.swing.*;
import java.awt.*;

class FrameDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing窗体");
        f.setSize(500, 300);
        f.setBackground(Color.YELLOW);
        Container contentPane = f.getContentPane();
        contentPane.setBackground(Color.CYAN);
        f.setLocation(300, 200);
        JButton jButton1 = new JButton("界面1");
        JButton jButton2 = new JButton("界面2");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        f.add(jButton1);
        f.add(jButton2);
        f.setVisible(true);
    }
}
