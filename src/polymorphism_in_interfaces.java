interface camera1{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4k(){
        greet();
        System.out.println("recording in 4k");
    }
}
interface wifi1{
    String[] getnetworks();
    void connecttonetworsk(String network);

}
class mycellphone1{
    void callnumber(int phonenumber){
        System.out.println("Calling"+phonenumber);

    }
    void pickcall(){
        System.out.println("Connecting...");
    }

}
class smartphone11 extends mycellphone1 implements wifi1,camera1{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording");
    }
    public String[] getnetworks(){
        System.out.println("list");
        String[] list={"nice","69"};
        return list;
    }
    public void connecttonetworsk(String network){
        System.out.println("COnnection to "+network);
    }
    public void str(){
        System.out.println("get networks");
    }
}

public class polymorphism_in_interfaces {
    public static void main(String[] args) {
        //polymorphism restricts tne accesses of the object to the particular interface which is accessed
        camera1 cam= new smartphone11();// this is a smartphone use it as a camera
        smartphone11 s=new smartphone11(); //can use all the methods
        //cam.getnetwork(); not allowed
       // cam.str();
        cam.record4k();
//implementing an interface forces method implementation
    }
}
