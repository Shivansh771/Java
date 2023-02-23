public class method_overloading {
    //method overloading means that two methods can have the same name but might take different parameters like given below
    //parameter is when the value is not assigned to a variable int a (is an parameter) argument is when value is assigned argument are actual
    //method overloading cannot be performed by changing the return types of method
    static void foo(){
        System.out.println("pushing P");

    }
    /* static int foo(int a){    //not method overloading
        System.out.println(a);
        return a;
        }*/

    static void foo(int a){
        System.out.println(a+"damn b going private");


    }

    public static void main(String[] args) {
        foo();
        foo(20000);
    }
}
