import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Membuat label selamat datang
        JLabel welcomeLabel = new JLabel("Selamat Datang");
        welcomeLabel.setBounds(120, 20, 120, 25);
        panel.add(welcomeLabel);

        // Membuat tombol
        JButton button = new JButton("Tekan Saya");
        button.setBounds(90, 60, 120, 25);
        panel.add(button);

        // Menambahkan action listener pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Membuat pesan dialog saat tombol ditekan
                JOptionPane.showMessageDialog(null, "Saya senang");
            }
        });
    }
}
