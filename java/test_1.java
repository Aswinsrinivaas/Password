



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suresh A
 */
public class test_1 implements ActionListener {
    private static int b;
  int ii=0;
  JFrame f;
  String c=null;
    private BufferedImage j;
    public test_1(String b ) {
      this.c=b;
      System.out.println(c);
     
        JButton button[]=new JButton[16];
          //BufferedImage image;
        f = new JFrame("Image Panel");
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
      // image = ImageIO.read(new File("image/34007.jpg"));
          Toolkit toolkit = Toolkit.getDefaultToolkit();

        final JPanel ip = new FireworkPanel_1();
        ip.setLayout(new GridLayout(4,4,20,20));
//     
        ip.setBorder( new EmptyBorder(50,50,50,50) );
        int j=1;
       for ( ii=0; ii<16; ii++) {
           Image image = toolkit.getImage("image/"+j+".jpg");
           
            Image scaledImage = image.getScaledInstance(300, 200, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(scaledImage);
     button[ii] = new JButton(Integer.toString(j),icon);
    
            ip.add( button[ii] );
            
       j++;
        }

        ip.setPreferredSize(new Dimension(950,768));
        f.setContentPane(ip);
        f.pack();
        f.setVisible(true);
        
          for ( ii=0; ii<16;ii++ ) {
        button[ii].addActionListener(this); 
       

    }
    
    }
     public static void main(String[] args) throws Exception {
    new test(b);
        //          JButton button[]=new JButton[16];
        //          //BufferedImage image;
        //        JFrame f = new JFrame("Image Panel");
        //        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //      // image = ImageIO.read(new File("image/34007.jpg"));
        //          Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Image image = toolkit.getImage("image/HD-Nature-Wallpapers-4.jpg");
        //        JPanel ip = new FireworkPanel();
        //        ip.setLayout(new GridLayout(4,4,20,20));
        ////
        //        ip.setBorder( new EmptyBorder(50,50,50,50) );
        //       for (int ii=0; ii<16; ii++) {
        //
        //
        //            Image scaledImage = image.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        //            ImageIcon icon = new ImageIcon(scaledImage);
        //     button[ii] = new JButton(icon);
        //
        //            ip.add( button[ii] );
        //
        //
        //        }
        //
        //        ip.setPreferredSize(new Dimension(640,480));
        //        f.setContentPane(ip);
        //        f.pack();
        //        f.setVisible(true);
        //ip.setImage( new ImageIcon(image) );
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            f.setVisible(false);
            new Test1_1(Integer.parseInt(e.getActionCommand()),c);
            
            System.out.println(e.getActionCommand());
        } catch (IOException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                          

}
