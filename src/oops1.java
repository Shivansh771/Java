class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("name is :"+name);
        System.out.println("id is :"+id);
    }
    public int getsalary(){
        return salary;
    }
}
public class oops1{
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        employee emp = new employee();
        emp.name="League";
        emp.id=1121;
        System.out.println(emp.id);
        emp.printdetails();
        employee join=new employee();
        join.id=12;
        join.name="jon";
        join.printdetails();
        join.salary=12;
        System.out.println(join.getsalary());

    }
}