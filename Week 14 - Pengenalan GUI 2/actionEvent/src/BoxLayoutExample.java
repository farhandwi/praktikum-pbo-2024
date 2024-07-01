import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Mengatur komponen secara vertikal

        panel.add(new JButton("Button 1"));
        panel.add(Box.createVerticalStrut(10)); // Spasi vertikal
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
