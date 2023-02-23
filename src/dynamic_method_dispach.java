class phone {
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("phone is on");

    }

}
class smartphone extends phone{
    public void swagat(){
        System.out.println("apka swagat hai");
    }
    public void on(){
        System.out.println("Smartphone is on");
    }
}
public class dynamic_method_dispach {
    public static void main(String[] args) {
        //phone obj=new phone(); allowed
        //smartphone  mob=new smartphone(); allowed
        //obj.name();
        phone obj=new smartphone(); //allowed
        //smartphone obj2= new phone(); not allowed
        //super class ka reference subclass ke object ke barabar ho sakta hai
        obj.greet();
        obj.on(); //object ka method run hoga reference ka nahi hota
        //obj.swagat(); not allowed as it is not in super class
        obj.greet();
    }
}
// method runtime pe deside hoga konsa run hoga kyuki object runtime pe banta hai
