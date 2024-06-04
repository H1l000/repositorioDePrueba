import javax.swing.*;
import java.awt.*;

public class BorrarHombre extends JFrame {
    private JPanel panelborrar1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTable table1;
    private JButton atrásButton;
    private JButton añadirButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public BorrarHombre() throws HeadlessException {
        setContentPane(panelborrar1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame Frame = new BorrarHombre();
                Frame.setVisible(true);
                Frame.setSize(1200, 1000);
            }
        });
    }
}

