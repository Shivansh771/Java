class myemp{
    private int id;
    private String name;
    public void setName(String n){
        name=n;

    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(int n){
        return id;
    }
}
public class access_modifiers {
    public static void main(String[] args) {
        myemp emp=new myemp();
       // emp.id=1; throws an error due to private access modifier
        emp.setName("Got a house in the hills and i fucking hate it" );
        System.out.println(emp.getName());

    }

}
