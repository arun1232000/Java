package emp;
import com.sun.media.sound.JARSoundbankReader;

public class Employee1 {
    int emp_id;
    String emp_name;
    int salary;
    Employee1(int a,String b,int c)
    {
      emp_id = a;
      emp_name = b;
      salary = c;
    }
    public void totalsalary()
    {
    int totalsalary = salary+((salary*20)/100);
    System.out.println("totalsalary is:" +totalsalary);
    
}
    
            
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee1 E = new Employee1(8,"riya",10000);
        
        E.totalsalary();
        // TODO code application logic here
    }
    
}
