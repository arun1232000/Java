
package stringmanip;
import java.util.Scanner;
public class StringManip {
    String str1;
    
    StringManip(String s){
        str1=s;
        
    }
    
    public void strLen(){
        System.out.println("\n The length of string1 :"+str1.length());
        
        
    }
    
    public void strConcat(){
        System.out.println("\n Concatenated String 'HELLO':"+(str1.concat("HELLO")));
        
    }
    
    public void charpos(){
        System.out.println("\n Character at position 4 in string1:"+(str1.charAt(3)));
        
    }
    
    public void compare(){
        System.out.println("\n Compare to 'JAVA '"+(str1.compareTo("JAVA")));
    
    }
    
    public static void main(String[] args) {
        String str;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the String");
        str=sc.nextLine();
        
        StringManip s1=new StringManip(str);
                s1.strLen();
                s1.strConcat();
                s1.charpos();
                s1.compare();
             
    }
    
}
