import java.util.ArrayList;

public class printing_subsequence_whose_sum_is_k {
    public static void subseq(int i,ArrayList<Integer> a,int s,int sum,int arr[],int n){
        if(i==n){
            if(sum==s){
                System.out.println(a);

            }
            return;
        }
        a.add(arr[i]);
        s+=arr[i];
        subseq(i+1,a,s,2,arr,3);
        s-=arr[i];
        a.remove(a.size()-1);
        subseq(i+1,a,s,2,arr,3);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        ArrayList<Integer> a = new ArrayList<Integer>();
        subseq(0,a,0,2,arr,3);
    }
}
