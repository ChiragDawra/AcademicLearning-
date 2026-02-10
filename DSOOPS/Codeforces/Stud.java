import java.util.*;
class Student{
    int rollNo = 10;
    public Student(int rollNo){
        this.rollNo = rollNo;
    }
    public Student(){}
    public void display(){
        System.out.println("Roll NO"+this.rollNo);
    }
    @Override
    public String toString(){
        return "Student roll Number: "+this.rollNo;
    }
}
public class Stud{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(10);
        System.out.println(s1);
         System.out.println(s2);
          System.out.println(s1.equals(s2));
           System.out.println(s1==s2);
    }
}