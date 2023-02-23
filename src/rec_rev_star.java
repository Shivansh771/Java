public class rec_rev_star {
    static void star(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("X");

            }
            System.out.println();
            star(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        star(n);
    }
}
