
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Crisp
 */
public class Userview extends javax.swing.JFrame {
String Ano,s1,s2,s3;
int d,d1,d2,d3,d4,d5=0;
Statement smt,smt1,smt2;
ResultSet rs;
    
    public Userview() {
        initComponents();
        Dimension scrn = getToolkit().getScreenSize();
            setBounds(0,0,scrn.width,scrn.height-30);
    }

   Userview(int a){
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
            String query = "select * from atm where Cid='" + d + "'";
            rs = smt.executeQuery(query);
            while (rs.next()) {
                d2=rs.getInt(1);
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
         Dimension scrn = getToolkit().getScreenSize();
            setBounds(0,0,scrn.width,scrn.height-30);
            s1=Integer.toString(d2);
            System.out.println(s1);
            jTextField1.setText(s1);
 
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 0);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("User View Details");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(450, 20, 200, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1110, 90);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 1030, 170);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("User Id:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(330, 40, 80, 30);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(400, 30, 120, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(540, 30, 90, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(12, 280, 1030, 240);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(510, 560, 150, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 90, 1110, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
        String select;
    
select ="select *  from register where id='" + jTextField1.getText() + "'";
ResultSet rs=smt.executeQuery(select);
ResultSetMetaData md=rs.getMetaData();
int columnCount = md.getColumnCount();
Vector columns=new Vector(columnCount);
for(int i=1;i<=(columnCount);i++){
    columns.add(md.getColumnName(i));
}
Vector data= new Vector();
Vector row;
while(rs.next())
{
    row = new Vector(columnCount);
    for(int i=1;i<=(columnCount);i++){
       row.add(rs.getString(i));
    }
  
    data.add(row);
    DefaultTableModel df=new DefaultTableModel(data,columns);
    jTable2.setModel(df);
/*    System.out.print(rs.getString(1) +" ");
    System.out.print(rs.getString(2) +" \n");*/
    
}
    }catch(Exception e){
        e.printStackTrace();
    }
    try{
        String select;
   
select ="select * from atm where Cid='" + jTextField1.getText() + "'";
ResultSet rs=smt.executeQuery(select);
ResultSetMetaData md=rs.getMetaData();
int columnCount = md.getColumnCount();
Vector columns=new Vector(columnCount);
for(int i=1;i<=(columnCount);i++){
    columns.add(md.getColumnName(i));
}
Vector data= new Vector();
Vector row;
while(rs.next())
{
    row = new Vector(columnCount);
    for(int i=1;i<=(columnCount);i++){
       row.add(rs.getString(i));
    }
  
    data.add(row);
    DefaultTableModel df=new DefaultTableModel(data,columns);
    jTable1.setModel(df);
/*    System.out.print(rs.getString(1) +" ");
    System.out.print(rs.getString(2) +" \n");*/
    
}
    }catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            this.hide();
            Pinno p=new Pinno();
            p.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userview().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
