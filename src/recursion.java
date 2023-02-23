public class recursion {
    static int factorial(int n){
        int res;
        if (n==0||n==1){
            return 1;
        }
        else{

        return n*factorial(n-1);
    }}
    static int factorial_itterative(int a){
        int res=1;
        for(int i=1;i<=a;i++){
           res*=i;
        }
        return res;
    }

    public static void main(String[] args) {
    int n=4;
        System.out.println(factorial(4));
        System.out.println(factorial_itterative(5));
    }
}
