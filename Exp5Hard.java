import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Exp5Hard {
    public static void main(String[] args) {
        System.out.println("1) ADD AN EMPLOYEE");
        System.out.println("2) DISPLAY ALL");
        System.out.print("ENTER CHOICE: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                try{
                    System.out.println("ENTER NAME: ");
                    String name = sc.next(); 
            
                    System.out.println("ENTER ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  
            
                    System.out.println("ENTER DESIGNATION: ");
                    String desig = sc.nextLine();
            
                    System.out.println("ENTER SALARY: ");
                    double salary = sc.nextDouble();
                    Employee e1 = new Employee(name, id, desig, salary);
                    FileOutputStream fout = new FileOutputStream("Exp5Hard.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fout);
                    out.writeObject(e1);
                    out.flush();
                    out.close();
                    fout.close();
                    System.out.println("success");
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                break;
        
            case 2:
            try{
                FileInputStream fin = new FileInputStream("Exp5Hard.txt");
                ObjectInputStream in = new ObjectInputStream(fin);
                try{
                    while(true){
                        Employee e2= (Employee)in.readObject();
                        System.out.println(e2.name+" "+e2.id+" "+e2.desig+" "+e2.salary);
                    }
                }
                catch(Exception ex){
                   break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
                break;
            default:
            System.out.println("WRONG CHOICE");
            break;
        }
    }
}
class Employee implements Serializable{
    String name;
    int id;
    String desig;
    double salary;
    Employee(String name,int id,String desig,double salary){
        this.name=name;
        this.id=id;
        this.desig=desig;
        this.salary=salary;
    }
}
