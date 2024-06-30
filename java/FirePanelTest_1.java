

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 *
 * @author Administrator
 */
public class FirePanelTest_1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Fireworks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 625);
        //frame.setResizable(false);
        //frame.setUndecorated(true);
        //frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel = new JLabel("Fireworks By Elango");
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(jLabel);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new FireworkPanel(), BorderLayout.CENTER);
        frame.setVisible(true);


    }
}
