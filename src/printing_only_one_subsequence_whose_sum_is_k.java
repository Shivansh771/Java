import java.util.ArrayList;

public class printing_only_one_subsequence_whose_sum_is_k {
    public static boolean subseq(int i,ArrayList<Integer> a,int s,int sum,int arr[],int n){
        if(i==n){
            if(sum==s){
                System.out.println(a);
                return true;

            }
           else{ return false;}
        }
        a.add(arr[i]);
        s+=arr[i];
        if(subseq(i + 1, a, s, 2, arr, 3)){
            return true;
        }
        s-=arr[i];
        a.remove(a.size()-1);
        if(subseq(i+1,a,s,2,arr,3)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        ArrayList<Integer> a = new ArrayList<Integer>();
         subseq(0,a,0,2,arr,3);
    }
}
