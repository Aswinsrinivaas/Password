
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SmsSender
{
  //Replace your way2sms username and password below
   String _userName = "9345031930";
   String _password = "12251992";
  String _url = "http://ubaid.tk/sms/sms.aspx";
   String charset = "UTF-8";
 String phoneno=null;
  Statement smt;
  String uname=null;
  String pass=null;
  String phone=null;
  String mail=null;
  String image1=null;
  String image2=null;
  String slider=null;
  int b=0;

    public SmsSender(int a){
        try {
            this.b=a;
            System.out.println(b);
            msg(b);
            String testPhoneNo = "9876543210";
        String testMessage = "Sending Messages From java is not too hard";
            sendMessage(testPhoneNo,testMessage);
        } catch (Exception ex) {
            Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void msg(int a){
     try{
         Connection con;
            String url = "jdbc:mysql://localhost:3306/imagepassword1";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
            smt = (Statement) con.createStatement();
   ResultSet rs=smt.executeQuery("select username,password,phoneno,mailid,imagepixelx,imagepixely,slidercount from register where id='"+b+"' ");
   while(rs.next()){
       uname=rs.getString("username");
       pass=rs.getString("password");
       phone=rs.getString("phoneno");
       mail=rs.getString("mailid");
       image1=rs.getString("imagepixelx");
       image2=rs.getString("imagepixely");
       slider=rs.getString("slidercount");
       
   }
   
//   String msg="You Have Loged On To Your Account";
//                  String url = "http://ubaid.tk/sms/sms.aspx?uid=9786676521&pwd=254144&msg="+"Message:"+msg+"UserName:"+uname+"Password:"+pass+"ImagePixelX:"+image1+"ImagePixelY:"+image2+"SliderCount:"+slider+"&phone="+phone+"&provider=way2sms";  
//    
//   // String url = "http://ubaid.tk/sms/sms.aspx?uid=9345031930&pwd=12251992&msg="+"ver"+"&phone=9751276580&provider=way2sms";  
//   
//    
//    ////* way to send sms 2 *////
//    JEditorPane editorPane = new JEditorPane(url);
//    editorPane.setEditable(false);
////  URL url1 = new URL(url);
////URLConnection con = url1.openConnection();
   
    }catch(Exception e){
        e.printStackTrace();
    }
}
  //to build the query string that will send a message
  private  String buildRequestString(String targetPhoneNo, String message) throws UnsupportedEncodingException
  {
      String msg="You Have Loged On To Your Account";
    String [] params = new String [5];
    params[0] = _userName;
    params[1] = _password;
    params[2] = "Message:"+msg+"UserName:"+uname+"Password:"+pass+"ImagePixelX:"+image1+"ImagePixelY:"+image2+"SliderCount:"+slider;
    params[3] =phone;
    params[4] = "way2sms";

    String query = String.format("uid=%s&pwd=%s&msg=%s&phone=%s&provider=%s",
        URLEncoder.encode(params[0],charset),
        URLEncoder.encode(params[1],charset),
        URLEncoder.encode(params[2],charset),
        URLEncoder.encode(params[3],charset),
        URLEncoder.encode(params[4],charset)
        );
    return query;
  }

  public  void sendMessage(String reciever, String message) throws Exception
  {
    //To establish the connection and perform the post request
    URLConnection connection = new URL(_url + "?" + buildRequestString(reciever,message)).openConnection();
    connection.setRequestProperty("Accept-Charset", charset);

    //This automatically fires the request and we can use it to determine the response status
    InputStream response = connection.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(response));
    System.out.println(br.readLine());
  }

//  public static void main(String [] args)
//    throws Exception
//  {
//    String testPhoneNo = "9876543210";
//    String testMessage = "Sending Messages From java is not too hard";
//
//    
//  }
}