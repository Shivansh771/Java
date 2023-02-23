interface bike{
    int a=43;

    void applybrake(int dec);
    void speedup(int increment);

}
class cycle implements bike{
    int speed=7;
    //you can create property in interfaces but you cannot modify the property as they are final

    @Override
    public void applybrake(int dec) {
        speed-=dec;
    }
   public void speedup(int increment){
        speed+=increment;
    }
}
public class interfaces {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.applybrake(23);
        System.out.println(c.a);

    }
}
