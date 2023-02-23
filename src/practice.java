import java.util.Locale;
import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.toLowerCase());
        System.out.println(s.replace(" ","_"));
        String name="Dear <name>, Thanks a lot";
        System.out.println(name.replace("<name>",s));
    }
}
