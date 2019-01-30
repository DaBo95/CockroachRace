import javax.swing.*;
import java.awt.*;

/**
 * Created by Dasha on 30.01.2019.
 */
public class Main extends JFrame {

    private JPanel panel;

    private int countOfTracks = 5;
    private int cockroachSize = 50;

    public static void main(String[] args) {

        new Main();

    }

    private Main() {

        initPanel();
        initPanel2(panel);
        initFrame();
    }

    private void initFrame() {

        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cockroach race");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void initPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("track"), 0, 30, this);
            }
        };


        panel.setPreferredSize(new
                        Dimension(600, 700)
        );

        add(panel);

    }

    private void initPanel2(JPanel panel) {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("cockroach2"), 0, 0, this);
            }
        };


        panel.setPreferredSize(new
                        Dimension(600, 700)
        );

        add(panel);

    }

    private Image getImage (String fileName) {
        String name = "images/" + fileName.toLowerCase()+".png";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(name));

        return  imageIcon.getImage();
    }
}
