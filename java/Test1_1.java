/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Perumal S
 */
public class Test1_1  extends JFrame implements ActionListener{
 Statement smt;
String e=null;
    public Test1_1(int i,String b) throws IOException {
        
        
       this.e=b;
       System.out.println(e);
        JButton button=new JButton("Submit");
       
        button.setBounds(140, 80, 80, 40);
       button.addActionListener(this);
      
        JFrame f = new JFrame("Image Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //f.setUndecorated(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("image/" + i + ".jpg");
        ImageIcon image = new ImageIcon("image/" + i + ".jpg");
     BufferedImage bi=ImageIO.read(new File("image/" + i + ".jpg"));
     String a=null;
        //JPanel panel = new JPanel();
        //JLabel label = new JLabel(image);
        ImageBuffer_1 im=new ImageBuffer_1(bi,e);
      //  panel.add(label);
        //panel.add(button);
        f.setContentPane(im);
       
        f.pack();

        for (int j = 10; j < 600; j++) {
            f.setBounds(500 - (j / 2), 300 - (j / 2), j, j);
            f.setMinimumSize(new Dimension(j, j));
            //Image scaledImage = img.getScaledInstance(j, j, Image.SCALE_DEFAULT);
            //ImageIcon icon = new ImageIcon(scaledImage);
            //label = new JLabel("", icon, JLabel.CENTER);
            f.setVisible(true);
        }
        //label = new JLabel("", image, JLabel.CENTER);
        
        //panel.setPreferredSize(new Dimension(640, 480));

        
    }
    
    
    public void actionPerformed(ActionEvent e) {
     
       
       
        System.out.println(e.getActionCommand());
    }
}
