import org.w3c.dom.ls.LSOutput;

abstract class parent4{
    public parent4(){
        System.out.println("Base 4 constructor" );

    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
    }
class child3 extends parent4{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }


//} class child4 extends parent4{
//    child4(){
//        System.out.println("child 4");
//    } greet method must be implemented for this class as it extends parent if it extended child it would not be necessary
}
//class child4 extends parent4{
//    @Override
//    public void greet() {
//        System.out.println("good afternoon");
//    }
//}
abstract class child4 extends parent4{
    child4(){
        System.out.println("abstract class child 4");
    }
}
public class abstract_Class {
    public static void main(String[] args) {
   // parent4 p=new parent4(); abstract class cannot be initiated

    }
}
