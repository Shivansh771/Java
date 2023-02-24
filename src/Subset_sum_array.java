//User function Template for Java//User function Template for Java
import java.io.*;
import java.util.*;
class Subset_sum_array{
public void main(String args[])throws IOException{

        Scanner sc=  new Scanner(System.in);
        int t=sc. nextInt();

        while(t-->0 ){
        int N=sc.nextInt();
       ArrayList<Integer>arr= new ArrayList<>();
        for(int i = 0; i < N ; i++){
        arr.add(sc . nextInt());}

        Solution1 ob = new Solution1();
        ArrayList<Integer> ans= Solution1.subsetSums(arr,N);
        Collections.sort(ans) ;
        for(int sum : ans){
        System.out.print(sum+" ");}
        System.out.println();}}}
class Solution1{
    private static void fun(int ind,ArrayList<Integer>arr , int n,int sum,ArrayList<Integer> ds){
        if(ind==n){
            ds.add(sum);
            sum=0;
            return;
        }
        sum+=arr.get(ind);
        fun(ind+1,arr,n,sum,ds);
        sum-=arr.get(ind);
        fun(ind+1,arr,n,sum,ds);
    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ds=new ArrayList<Integer>();
        fun(0,arr,N,0,ds);
        return ds;
    }
}