public class sum_of_n_recursion {
    static int sumofn(int n){
        int res=0;
        if (n==0){
            return 0;
        }
        else{
            res=n+sumofn(n-1);
            return res;
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofn(n));
    }
}
