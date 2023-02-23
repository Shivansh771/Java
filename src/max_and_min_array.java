import java.util.Scanner;
public class max_and_min_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int i=sc.nextInt();
        int[] li=new int[i];
        for(int j=0;j<i;j++){
            System.out.printf("Enter the %d element",(j+1));
            li[j]=sc.nextInt();
        }
        int max=0,min=li[0];
        for(int e:li){
            if(e>max){
                max=e;
            }
        }
        for(int f:li){
            if(f<min){
                min=f;
            }
        }
        System.out.println("max is "+max);
        System.out.println("Min is "+min);

    }
}
