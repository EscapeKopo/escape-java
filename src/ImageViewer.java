import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;

public class ImageViewer {
    private JFrame frame;
    private JLabel label;

    public ImageViewer() {
        frame = new JFrame("게임 화면");
        label = new JLabel();

        frame.add(label);
        frame.setSize(520, 340);
        frame.setLocation(50, 50);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }

    public void showImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image changeImg = img.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);

        label.setIcon(changeIcon);

        frame.toFront();
    }
}