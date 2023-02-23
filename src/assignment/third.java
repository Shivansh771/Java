//
//abstract class Marks{
//    abstract void getPercentage();
//
//}
//class A extends Marks{
//    double a=0, b=0,c=0;
//    A(double a,double b, double c){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//    }
//
//    @Override
//   public void getPercentage() {
//        double v = a + b + c;
//        System.out.println("Percentage of A is " +((v/300)*100));
//    }
//}
//class B extends Marks{
//    double a=0,b=0,c=0,d=0;
//    B(double a, double b,double c,double d){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//        this.d=d;
//
//    }
//
//    @Override
//   public void getPercentage() {
//        double v=a+b+c+d;
//        System.out.println("Percentage of B is "+((v/400)*100));
//
//    }
//}
//public class third
//
//{
//    public static void main(String[] args) {
//        A a=new A(60,70,80);
//        B b=new B(80,98,78,98);
//        a.getPercentage();
//        b.getPercentage();
//
//    }
//}