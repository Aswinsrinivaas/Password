/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crisp
 */
import java.util.regex.*;
public class phone
{
 public static void main(String args[])
         
 {
     String str_phone_no="9786676521";
 Pattern p=Pattern.compile("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$");
 Matcher m=p.matcher(str_phone_no);
 boolean matchFound = m.matches();
 if(matchFound)
 {
 System.out.println("Phone number format is ok.");
 }
 else
 {
 System.out.println("Wrong phone number format.");
 }
 }
}