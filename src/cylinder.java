class cyl{
    private int radius;
    private int height;

    public cyl(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
    public double volume(){
        return radius*radius*height*Math.PI;
    }
}
public class cylinder {
    public static void main(String[] args) {
        cyl cyl =new cyl(1,2);
        cyl.setHeight(34);
        cyl.setRadius(3);
        System.out.println(cyl.getHeight());
        System.out.println(cyl.getRadius());
    }
}
