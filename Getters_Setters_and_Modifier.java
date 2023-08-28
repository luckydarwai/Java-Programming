
class Employee {
    private int id;
    private String name;

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
       this.name = n;
    }

    public String getname() {
        return name;
    }

}

public class Getters_Setters_and_Modifier {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
      emp1.setid(23);
       emp1.setname("Lucky");

       System.out.println("Printing Employee Details");
       System.out.println(emp1.getid());
       System.out.println(emp1.getname());


    }
}
