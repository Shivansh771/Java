class a{
    public int a;
    public int me() {
    return 3;
    }
    public void meth3(){
        System.out.println("Method 2 of class a");

    }
    }
class b extends a{
    public void meth3(){
        System.out.println("method 2 of class b");
    }
    public void meth2(){
        System.out.println("Method 3 ");
    }
}
public class method_overriding
{
    public static void main(String[] args) {
        a a =new a();
        a.meth3();
        b b=new b();
        b.meth3();

    }
}
