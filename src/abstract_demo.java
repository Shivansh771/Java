abstract class A{
    int i;
    abstract void display();
}
class B extends A{
    int j;

    @Override
    void display() {
        System.out.println(j);
    }
}
public class abstract_demo
{
    public static void main(String[] args) {
        B obj=new B();
        obj.j=2;
        obj.display();
    }
}
