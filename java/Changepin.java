/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Crisp
 */
public class Changepin extends javax.swing.JFrame {
String Ano,s1,s2,s3;
int d,d1,d2,d3,d4,d5=0;
Statement smt,smt1,smt2;
ResultSet rs;
//String s1,s2,s3,s4,s5,s6=null;
    /**
     * Creates new form Changepin
     */
    public Changepin() {
        initComponents();
        Dimension scrn = getToolkit().getScreenSize();
            setBounds(0,0,scrn.width,scrn.height-30);
    }

    public Changepin(GraphicsConfiguration gc) {
        super(gc);
    }
    Changepin(int a){
         this.d=a;
         System.out.println(d);
      try {
            Connection con;
            String url = "jdbc:mysql://localhost:3306/imagepassword1";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
            smt = con.createStatement();
             smt1 = con.createStatement();
              smt2 = con.createStatement();
                     
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
         Dimension scrn = getToolkit().getScreenSize();
            setBounds(0,0,scrn.width,scrn.height-30);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CHANGE PINNUMBER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 30, 210, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Enter OLD PinNumber:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(230, 80, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enter New PinNumber:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(230, 180, 160, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Enter New Conform PinNumber:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 290, 210, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(410, 390, 100, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(600, 390, 100, 30);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(410, 70, 300, 50);
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(410, 180, 300, 50);
        jPanel2.add(jPasswordField3);
        jPasswordField3.setBounds(400, 280, 320, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1060, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.hide();
     Pinno l=new Pinno();
      l.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           int i=0;
           String old=jPasswordField1.getText();
			String n=jPasswordField2.getText();
			String cn=jPasswordField3.getText(); 
			
			s1=Integer.toString(d3);
                         String query = "select * from register where id='" + d + "'";
            rs = smt.executeQuery(query);
            while (rs.next()) {
                String a=rs.getString(13);
                if((jPasswordField1.getText().equalsIgnoreCase(a))){
                i=1;
                
            }
      if(i==1){
              
			
				//JOptionPane.showMessageDialog(this,"Enter a Pin numbers");
                                ;
			//}
			//else{
				//if(s1.equals(old)){
				//	try{
					
//					String query="update atm set pinno='"+cn+"' where Accountno='"+d2+"' ";
//					smt.executeUpdate(query);
                                        String query1="update register set pinnumber='"+cn+"' where id='"+d+"' ";
                                        String query2="update atm set pinno='"+n+"' where Cid='"+d+"' ";
					smt1.executeUpdate(query1);
                                        smt2.executeUpdate(query2);
					JOptionPane.showMessageDialog(this,"Sucessfully modified");
      }else{
          JOptionPane.showMessageDialog(this,"Enter Correct Pinnumber");
      }
					
					
					
				//	}
				
			//	catch(Exception e){
			//		e.printStackTrace();
			//	}
                                        
					
					
					
			//	}
			//	else{
			//		JOptionPane.showMessageDialog(this,"Enter a correct Pin numbers");
			//	}
			}
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
