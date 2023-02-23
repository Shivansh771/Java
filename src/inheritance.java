class base{
    int x;
    public int getX(){
        return x;

    }

    public void setX(int x) {
        this.x = x;

    }
    public void printme(){
        System.out.println("I am a constructor");
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(3);
        System.out.println(b.getX());
        derived d=new derived();
        d.setX(4);


    }
}
