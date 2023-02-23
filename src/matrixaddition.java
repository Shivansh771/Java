import java.util.Scanner;
public class matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int i =sc.nextInt();
        System.out.println("Enter the number of columns");
        int j=sc.nextInt();
        int[][] mat1=new int[i][j];
        for(int k=0;k<i;k++) {
            System.out.printf("Enter element of row %d\n",(k+1));
            for (int l = 0; l < j; l++) {

                mat1[k][l] = sc.nextInt();

            }
        }
        int[][] mat2=new int[i][j];
        for(int o=0;o<i;o++) {
            System.out.printf("Enter element of row %d\n",(o+1));
            for (int p = 0; p < j; p++) {

                mat2[o][p] = sc.nextInt();

            }
        }
        int[][] res= new int[i][j];
        for(int f=0;f<i;f++){
            for(int g=0;g<j;g++){
                res[f][g]=mat2[f][g]+mat1[f][g];
            }
        }
        for(int h=0;h<i;h++){
            for(int y=0;y<j;y++){
                System.out.print(res[h][y]+" ");
            }
            System.out.println();
        }


    }
}
