public class arraypractice {
    public static void main(String[] args) {
        /*float[] prac1={21.3f,21.4f,3.2f,32.3f};
        float sum=0;
        for (float v : prac1) {
            sum += v;
        }
        System.out.println(sum);*/
        /*int [] marks={1,2,3,4,5};
        boolean isINarray= false;
        int num =5;
        for(int element:marks) {
            if (num == element) {
                isINarray = true;
                break;
            }
        }
            if(isINarray){
                System.out.println("is in array");

            }
            else{
                System.out.println("not in array");

            }*/
        /*float marks[]={2.3f,32.3f,32.3f,32.332f,3.2f};
        float average=0,sum=0;
        for(float element:marks){
            sum+=element;

        }
        average=(sum)/marks.length;
        System.out.println(average);*/
        int[][] mat1={{1,2,3,},{4,5,6}};
        int[][] mat2={{23,45,6},{32,43,5}};
        int res[][]={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                res[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(res[i][j] +" ");

            }
            System.out.println();
        }
    }
}
