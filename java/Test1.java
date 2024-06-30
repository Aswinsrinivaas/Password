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
public class Test1  extends JFrame implements ActionListener{
 Statement smt;
 int e=0;
    public Test1(int i,int b) throws IOException {
        
        
       try{
        Connection con;
            String url = "jdbc:mysql://localhost:3306/imagepassword1";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
            smt = con.createStatement();
        
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
     File f1=new File("image/" + i + ".jpg");
     String s=f1.getPath();
     System.out.println(s);
      int query=0;
       query=smt.executeUpdate("update register set image= '"+i+"' where id='"+b+"'");
           
        //JPanel panel = new JPanel();
        //JLabel label = new JLabel(image);
        ImageBuffer im=new ImageBuffer(bi,e,s);
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
        
      
       }catch(Exception e){
           e.printStackTrace();
       }
     
        
      

        
    }
    
    
    public void actionPerformed(ActionEvent e) {
     
       
       
        System.out.println(e.getActionCommand());
    }
}
