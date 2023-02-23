class base1{//when there are multiple constructor in the parent clas the constructor without any parameters is called from the child class, if we want to call the constructor with parameters from the parent class we can use super keyword
    base1() {
        System.out.println("Constructor");
    }
    base1(int x){
        System.out.println("Overloaded constructor");
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class derived1 extends base1{
    derived1(){
        System.out.println("Derived constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("Overloaded constructor ");
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("Child of derived");

    }
    childofderived(int x,int y ,int z){
        super(x,y);
        System.out.println("overloaded child of derived");
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
        base1 b=new base1();
        derived1 d=new derived1(1,2);//by default it will run the non argument constructors of both parent and child class but if we use super we wil get the other
        childofderived cd= new childofderived(1,3,4);
        childofderived mc=new childofderived();
    }
}
