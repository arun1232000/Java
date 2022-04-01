package student6;


public class Student6 {
int m1,m2,m3;
Student6(int a,int b,int c)
{
 m1=a;
 m2=b;
 m3=c;
}
public void sum()
 {
int sum=m1+m2+m3;
System.out.println("sum ="+sum);
 }
public void percentage()
{
int s=m1+m2+m3;
int  percent=(s*100)/150;
System.out.println("percentage ="+percent);
}


public static void main(String[] args) {
Student6 s1=new Student6(20,50,40);
s1.sum();
s1.percentage();
       
}
    
}
