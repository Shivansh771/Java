import java.util.ArrayList;

public class printing_the_number_of_subsequence_whose_sum_is_k {
    public static int subseq(int i, int s, int sum, int[] arr, int n){
        if(i==n){
            if(sum==s){
                return 1;

            }
            else{ return 0;}
        }
        s+=arr[i];
        int l=(subseq(i + 1, s, 2, arr, 3));

        s-=arr[i];

        int r=(subseq(i+1,s,2,arr,3));
        return l+r;

    }
    public static void main(String[] args) {
        int[] arr= {1,2,1};

        System.out.println(subseq(0,0,2,arr,3));
    }
}
