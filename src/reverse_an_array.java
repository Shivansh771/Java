import java.util.Scanner;
public class reverse_an_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int i= sc.nextInt();
        int[] n=new int[i];
        for(int j=0;j<i;j++){

            n[j]=sc.nextInt();
        }
        int[] rev=new int[i];
        for(int k=0;k<i;k++){
            rev[k]=n[i-k-1];

        }
        System.out.println("reversed array is :");
        for(int l=0;l<i;l++){
            System.out.print(rev[l]+" ");
        }
    }
}
