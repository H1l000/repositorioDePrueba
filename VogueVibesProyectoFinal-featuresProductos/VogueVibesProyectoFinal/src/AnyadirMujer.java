import javax.swing.*;
import java.awt.*;

public class AnyadirMujer extends JFrame{
    private JPanel panel_central;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JButton atrásButton;
    private JButton añadirButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTable table1;

    public AnyadirMujer() throws HeadlessException {
        setContentPane(panel_central);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame Frame = new AnyadirMujer();
                Frame.setVisible(true);
                Frame.setSize(1200, 1000);
            }
        });
    }
}
