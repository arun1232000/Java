package employ;

import java.util.Scanner;
class Employ 
{
    int id;
    String name;
    float salary;
}
class Main{
            public static void main(String args[]) 
   {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of employees");
            int n = sc.nextInt();
            Employ emp[] = new Employ[n];
            for (int i = 0; i < n; i++) {
            emp[i] = new Employ();
            System.out.println("Enter details of employee " + (i + 1) );
            System.out.print("Enter employee id :");
            emp[i].id = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee salary :");
            emp[i].salary = sc.nextFloat();
}
 System.out.println("\n\n********* All Employee Details are :*********\n");
 for (int i = 0; i < n; i++) {
        System.out.println("\nEmployee Id :" + emp[0].id );
        System.out.println("\nEmployee Name :" + emp[i].name );
        System.out.println("\nEmployee Salary :" + emp[i].salary );
  }
   }
}
