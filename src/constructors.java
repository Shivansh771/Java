class myemp1{
    private int id;
    private String name;
    public myemp1(){//constructor no need to explicitly invoke
        id=12;
        name="Name";
    }
    //constructor overloading
public myemp1(String myName, int myID){// we can pass arguments in constructor
    id=myID;
    name=myName;
}

    public void setName(String n){
        name=n;

    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        myemp1 emp=new myemp1("name",12);
        // emp.setName("Raj");
        //emp.setId(1121);
        myemp1 emp1=new myemp1();
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
