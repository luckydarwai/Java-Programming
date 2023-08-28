class Employee1{
    
    
     int id;
     String name;
     float salary;

     public void printdata(){
         System.out.println("Your id is : "+id);
         System.out.println("Your Name is : "+name);
     }
     public int getsalary(int n){
         int salary = n;
         return salary;
     }

     

}
public class FirstOwnClass {
    public static void main(String[] args) {

        Employee1 emp1 = new Employee1();
        emp1.id = 23;
        emp1.name = "Lucky Darwai";
        int salary=emp1.getsalary(2309200);
        emp1.printdata();
        System.out.println("Salary of Emp1 is :"+salary);
        
    }
}
