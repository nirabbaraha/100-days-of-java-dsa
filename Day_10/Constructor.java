package Day_10;

import Student;

public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("NirabBaraha",4);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        
    }
    
}
class Student{
    String name;
    int rollno;

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
