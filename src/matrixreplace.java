import java.util.Scanner;
public class matrixreplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int[][] matrix=new int[3][3];
        int[] temp=new int[9];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                matrix[i][j]=sc.nextInt();
            }
        }
        for(int k = 0; k < 3;k++)
        {
            for(int s = 0; s < 3; s ++)
            {
                temp[(k * matrix.length) + s] = matrix[k][s];
            }
        }

        for(int e:temp){
            if(e>max){
                max=e;
            }
        }
        System.out.println("Original matrix");
        for(int r=0;r<3;r++){
            for(int t=0;t<3;t++){

                System.out.print(matrix[r][t]+" ");
            }
            System.out.println();

        }
        for(int q=0;q<3;q++){
            for(int w=0;w<3;w++){

                if (matrix[q][w] == max) {
                    matrix[q][w] = -1;

                    break;
                }
            }
        }
        System.out.println("After replacement");
        for(int y=0;y<3;y++){
            for(int n=0;n<3;n++){
                System.out.print(matrix[y][n]+" ");
            }
            System.out.println();
            }
        }
    }