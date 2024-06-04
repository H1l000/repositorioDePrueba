import javax.swing.*;
import java.awt.*;

public class BorrarMujer extends JFrame {
    private JPanel panelborrar2;
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
    public BorrarMujer() throws HeadlessException {
        setContentPane(panelborrar2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame Frame = new BorrarMujer();
                Frame.setVisible(true);
                Frame.setSize(1200, 1000);
            }
        });
    }
}


