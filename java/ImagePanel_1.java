

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImagePanel_1 extends JPanel {

    private Image image = null;

    ImagePanel_1(LayoutManager layout) {
        super(layout);
        Dimension scrn = getToolkit().getScreenSize();
            setBounds(0,0,scrn.width,scrn.height-30);
    }

    public void setImage(ImageIcon icon) {
        image = icon.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            System.out.println("imagepanel painting");
            g.drawImage(image,0,0,getWidth(),getHeight(),null); // see javadoc for more info on the parameters
        }
    }

   
}
