


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class login extends JFrame implements ActionListener 
{
	
	private static final long serialVersionUID = 1L;

	Container con;
	
	ButtonGroup 	g 			= new ButtonGroup();
	
	JLabel 			user		= new JLabel("USER NAME");
	JLabel 			pass		= new JLabel("PASSWORD");
	JLabel 			title		= new JLabel("LOGIN");
	
	JTextField 		usertext   	= new JTextField();

	JPasswordField 	passtext	= new JPasswordField ();
	ImageIcon in=new ImageIcon("user.png");
	ImageIcon in1=new ImageIcon("exit.png");
	ImageIcon in2=new ImageIcon("login.jpg");
       JLabel d2=new JLabel("                      WELCOME TO ABC BANK");
         //JLabel d2=new JLabel("        Neural Network Techniques for Proactive Password Checking");
	
	JButton 		login 		= new JButton("Login",in);
	JButton 		exit 		= new JButton("Exit",in1);
	JPanel pan = new JPanel();
	JLabel 			title1		= new JLabel("",in2,JLabel.CENTER);
	public login() {
		
		// TODO Auto-generated constructor stub
		con = getContentPane();
		setTitle("LOGIN WINDOW");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setVisible(true);
	 
	    pan.setLayout(null);
	    title1.setFont(new Font("Courier New", Font.BOLD, 30));
	    title1.setForeground(Color.blue);
	    pan.setBorder(BorderFactory.createEtchedBorder(1));
	 
           con.add(pan); 
	    pan.add(user);
		pan.add(pass);
		pan.add(usertext);
	    pan.add(passtext);
	  
	   
	        con.add(d2);
        d2.setBounds(70,50,900,50);
        d2.setFont(new Font("Courier New", Font.BOLD, 22));
        d2.setForeground(Color.BLUE);
        
        
        pan.add(login);
        pan.add(exit);
        con.add(title1);
   
       
	    
    	setBounds(0, 0, 1020, 770);
    	title1.setBounds(220, 160, 600, 30);
		title.setBounds(500, 190, 100, 40);
	   	user.setBounds(140, 80, 80, 40);
		pass.setBounds(140, 140, 80, 40);
		usertext.setBounds(260, 80, 150, 30);
		passtext.setBounds(260, 140, 150, 30);
		login.setBounds(140, 230, 120, 30);
		exit.setBounds(290, 230, 120, 30);
		
		pan.setBounds(220, 190, 600, 350);
		
		
		exit.addActionListener(this);
		login.addActionListener(this);
		setBackground(Color.BLUE);
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		
			
 UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
 //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");	
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    //UIManager.setLookAndFeel("com.easynth.lookandfeel.EaSynthLookAndFeel");
                    //UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
                    new login();
		}
		catch(Exception e)
		{
			e.fillInStackTrace();
		}
	 
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit)
		{
			JOptionPane.showMessageDialog(null, "YOUR WINDOW WILL EXIT","ALERT", 2);
			System.exit(0);
			
		}		
		if (e.getSource()==login)
		{
	
String username=usertext.getText();
String password=passtext.getText();
if((password.equalsIgnoreCase("admin"))&&(username.equalsIgnoreCase("admin")))
{
	Welcomepage newFile = new Welcomepage();	
	newFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	newFile.setSize(1024,780);
	newFile.setLayout(null);
    newFile.setVisible(true);
    this.hide();
}
else
{
	JOptionPane.showMessageDialog(null, "NOT SUCESS","LOGIN", 2);

}
		}
			
	}

}
