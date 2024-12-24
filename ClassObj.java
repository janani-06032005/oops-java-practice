package oop;

public class ClassObj {
    public static void main(String [] args){
        Student student1 = new Student(13,"janani",97.8f);
//        student1.changename("jananibaskar");
//        student1.greeting();
        Student student2 = new Student(22,"rahul",77.8f);

        Student student3 = new Student();

        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.mark);
        System.out.println();

        System.out.println(student2.rollno);
        System.out.println(student2.name);
        System.out.println(student2.mark);
        System.out.println();

        System.out.println(student3.rollno);
        System.out.println(student3.name);
        System.out.println(student3.mark);



    }
}
class Student{
    int rollno ;
    String name;
    float mark;


    void greeting(){
        System.out.println("hi my name is "+ name);
    }
    void changename(String newname){
        name = newname;
    }
//    this keyword is used to access the value of object created ... this ----> student1
//    eg : student1.rollno      student1.name        student1.mark
    Student(){
//        this.rollno = 22;
//        this.name = "janani";
//        this.mark = 78.90f;

        this(22,"raam",59.8f);
    }
    
    Student(int roll,String names,float marks){
        this.rollno = roll;
        this.name = names;
        this.mark = marks;
    }
}

