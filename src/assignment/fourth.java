abstract class pen{
    abstract void write();
    abstract void refil();

}
class fountain_pen extends pen{
    @Override
    void refil() {
        System.out.println("Refil the pen");

    }

    @Override
    void write() {
        System.out.println("Write with the pen");

    }
    void change_nib(){
        System.out.println("Change the nib of the pen");
    }
}
interface basicanimal{
    public void eat();
    public void sleep();
}
class monkey{
    void jump(){
        System.out.println("Monkey jumped");

    }
    void bite(){
        System.out.println("Monkey bites");
    }

}
class human extends monkey implements basicanimal{
    @Override
    public void eat() {
        System.out.println("Human eats");

    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps");

    }}
    abstract class telephone{
        abstract void lift();
        abstract void disconnect();



    }
    interface wifi{
        void show_available_networks();
        void connect_to_networks();
    }
    class smart_telephone extends telephone implements wifi{
        void lift(){
            System.out.println("lift");

        }

        @Override
        void disconnect() {
            System.out.println("Disconnected");

        }

        @Override
        public void show_available_networks() {
            System.out.println("Available networks ");

        }

        @Override
        public void connect_to_networks() {
            System.out.println("Connecting");
        }
    }
 interface tv_remote{
        void botton_press();
 }
 interface smart_tv_remote extends tv_remote{
     void google_assistant();
 }
 class tv implements tv_remote{
     @Override
     public void botton_press() {
         System.out.println("pressed a button");
     }
 }

public class fourth
{
    public static void main(String[] args) {
        fountain_pen fp=new fountain_pen();
        human h=new human();
        telephone t=new smart_telephone();
        monkey m=new human();
        tv tv=new tv();

}}
