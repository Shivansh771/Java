class Employee1 {
    int salary;
    String name;
    public int getsalary(){
        return salary;

    }
    public String getname(){
        return name;

    }
    public void setName(String n){
        name=n;
    }
}
class Cellphone{
    public void ringing(){
        System.out.println("ringing ");

    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void callfriend(){
        System.out.println("call friend");
    }
}
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return side*4;
    }
}
class rectagle{
    int len;
    int bredth;
    public int area(){
        return len*bredth;
    }
    public int perimeter(){
        return 2*(len+bredth);
    }
}
class tommy{
    public void hit(){
        System.out.println("hit");
    }
    public void run(){
        System.out.println("Run");

    }
    public void fire(){
        System.out.println("Fire");
    }
}
public class oopsprac {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.name="name";
        System.out.println(emp.getname());
        emp.salary=11;
        System.out.println(emp.getsalary());
        Cellphone moto= new Cellphone();
        moto.callfriend();
        moto.ringing();
        moto.vibrating();
        square sq= new square();
        sq.side=10;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        rectagle rec=new rectagle();
        rec.len=10;
        rec.bredth=1;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        tommy t=new tommy();
        t.fire();
        t.run();
        t.hit();

    }

}
