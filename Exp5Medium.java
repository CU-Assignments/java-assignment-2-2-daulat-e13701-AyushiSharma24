

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    float gpa;
    Student(int id,String name,float gpa){
            this.id=id;
            this.name=name;
            this.gpa=gpa;
    }
}
public class Exp5Medium {
    public static void main(String[] args) {
        try{
        Student s1 = new Student(122,"Ayushi",8);
        FileOutputStream fout = new FileOutputStream("Exp5medium.txt");

        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        fout.close();
        System.out.println("success");
        }
        catch(Exception e){
            System.out.println(e);
        }
        

        try{
            FileInputStream fin = new FileInputStream("Exp5medium.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Student s2= (Student)in.readObject();
        System.out.println(s2.id+" "+s2.name+" "+s2.gpa);
        in.close();
        fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}



