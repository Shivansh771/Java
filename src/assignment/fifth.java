interface ifly{
    void fly();
}
abstract class bird implements ifly {
    abstract void eat();
    abstract  void sleep();
    abstract void fly(int a);
}
class airpalane implements ifly{
    @Override
    public void fly() {
        System.out.println("Flying");

    }

}
class pigeon extends bird{
    @Override
    void eat() {
        System.out.println("Pegion eating");

    }

    @Override
    void sleep() {
        System.out.println("Pegion sleepoing");

    }

    @Override
   public void fly() {
        System.out.println("Flying ");
    }
    void fly(int a){
        System.out.println("Flying at a height"+a);
    }
}
class pecock extends bird{
    @Override
    void eat() {
        System.out.println("Pegion eating");

    }

    @Override
    void sleep() {
        System.out.println("Pegion sleepoing");

    }

    @Override
    public void fly() {
        System.out.println("Flying ");
    }
    void fly(int a){
        System.out.println("Flying at a height"+a);
    }
    void opening_wings(){
        System.out.println("Pecock opened its wings");
    }
}
public class fifth {
    public static void main(String[] args) {
        pecock p=new pecock();
        p.eat();
        p.fly();
        p.fly(32);
        pigeon pe= new pigeon();
        pe.eat();
        pe.fly();
        pe.fly(32);
    }
}
