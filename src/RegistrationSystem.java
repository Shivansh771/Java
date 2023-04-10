import javax.sound.midi.SysexMessage;
import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String temp=sc.next();
            if(map.containsKey(temp)){
                int m=map.get(temp)+1;
                map.put(temp,m++);
                System.out.println(temp+map.get(temp));
            }else{
                map.put(temp,0);
                System.out.println("OK");
            }

        }
    }
}
