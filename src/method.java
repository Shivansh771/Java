public class method {
     static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5,b=6;
        //if static not used in logic
        //method obj=new method;
        method obj=new method();
        //int c=obj.logic(a,b);
        int a1=2, b1=1;
        int c1;
        c1=logic(a1,b1);
    }
}

