import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for(int j=0;j<=10;j++){
            System.out.println(i+" X "+j+" = "+(i*j));
        }
    }
}