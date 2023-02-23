public class variableargument {
    static int sum(int ...arr) {
        int res=0;
        //now we can pass n number of arguments, and they would be stored in form of an array
        for (int a : arr) {
            res += a;

        }
        return res;
    }
    //if you want at least one argument in the varargs
    /*static int sum(int x int ...arr){
    int res=x;
    for(int a:arr){
    res+=a;}
    return res;}
     */
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("sum"+sum(4,5,6,7));
        System.out.println(sum(4,4,33,4,34,3,54));

        }
    }

