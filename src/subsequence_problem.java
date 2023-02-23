import java.util.ArrayList;


public class subsequence_problem {
    public static void sub(int i,int[]arr,int n,ArrayList<Integer> a){
        if (i==n){
            System.out.println(a);
            return;
        }
        sub(i+1,arr,n,a); //not picks, or not takes the index

        a.add(arr[i]); //takes or picks the particular index into the subsequence
        sub(i+1,arr,n,a);
        a.remove(a.size()-1);

    }
    public static void main(String[] args) {

        int[] arr={3,1,2};
        int n=3;
        ArrayList<Integer>a =new ArrayList<Integer>();
        sub(0,arr,n,a);
    }
}
