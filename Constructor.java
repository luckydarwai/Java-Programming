class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
        System.out.println(id);
        System.out.println(name);
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
        System.out.println(id);
        System.out.println(name);
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
        System.out.println(id);
        System.out.println(name);
    }

    // setters and getters (set methods and get methods)  // methods or function both are one.
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}


public class Constructor {
    public static void main(String[] args) { 
        // this is for a default constructor
        MyMainEmployee e1 = new MyMainEmployee("lucky");

        e1.setId(23);
        e1.setName("RAVI");
        System.out.println(e1.getId()); 
        System.out.println(e1.getName());// printing the name of employee
        
    }
}
