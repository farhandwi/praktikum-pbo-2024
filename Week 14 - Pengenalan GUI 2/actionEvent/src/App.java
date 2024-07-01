import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multi-Component ActionEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JTextField textField = new JTextField("Press Enter");

        // Menambahkan ActionListener ke Button 1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });

        // Menambahkan ActionListener ke Button 2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }
        });

        // Menambahkan ActionListener ke JTextField
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Enter pressed in JTextField. Text: " + textField.getText());
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(textField);

        frame.add(panel);
        frame.setVisible(true);
    }
}
