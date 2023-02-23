interface sample{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sample{
    void meth3();
    void meth4();
}
class  mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println(32);
    }
   public void meth2(){
        System.out.println(23);
    }
   public void meth3(){
        System.out.println(3);
    }
    public void meth4(){
        System.out.println(3);
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        mysampleclass oj=new mysampleclass();
        oj.meth1();
        oj.meth3();
        oj.meth2();
        oj.meth4();

    }
}
