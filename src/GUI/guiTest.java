package GUI;
import javax.swing.*;

public class guiTest extends JFrame {
    private JPanel mainPanel;
    private JButton createRoom;
    private JLabel raumnummer;
    private JLabel hausnummer;
    private JTextField hausnummerInput;
    private JTextField raumnummerInput;

    public guiTest() {
        //Oberfläche = mainPanel
        this.setContentPane(mainPanel);
        //wenn man auf X klickt, Programm beenden
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1500,1000);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        /*JFrame frame = new JFrame("guiTest");
        frame.setContentPane(new guiTest().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        */
        new guiTest();
    }
}
