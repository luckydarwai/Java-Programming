
public class Student{
    String studentName;
    int studentAge;
    //constructor
    Student(String name, int age){
        studentName = name;
        studentAge = age;
    }
    void display(){
        System.out.println(studentName+ " "+studentAge);
    }
    public static void main(String args[])
    {
        Student myObj = new Student("Lalit" , 19);
        myObj.display();
    }
}
