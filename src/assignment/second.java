abstract class shape{
    abstract double rectangle_area(int len,int bredth);
    abstract double circle_area(int r);
    abstract double square(int a);

}
class Area extends shape{
    double rectangle_area(int l,int b){
        return l*b;
    }
    double circle_area(int r){
        return Math.PI*r*r;
    }

    @Override
    double square(int a) {
        return a*a;
    }
}
public class second {
    public static void main(String[] args) {
    Area a = new Area();
        System.out.println("The area of rectangle with length 5 and bredth 4 is:"+a.rectangle_area(5,4));
        System.out.println("The area of circle with radius 5 is:"+a.circle_area(5));
        System.out.println("The area of square with side 5 is :"+a.square(5));

    }
}
