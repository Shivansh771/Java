class A1{
    int i=10;

}
class B1 extends A1{
    int i=20;
}
class output{
    public static void main(String[] args) {
        A1 obj1=new B1();

        System.out.println(obj1.i);
    }
}