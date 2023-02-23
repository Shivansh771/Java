//interface camera{
//    void takesnap();
//    void recordvideo();
//    private void greet(){
//        System.out.println("Good morning");
//    }
//    default void record4k(){
//        greet();
//        System.out.println("recording in 4k ");
//    }
//}
//interface wifi{
//    String[] getnetworks();
//    void connecttonetworsk(String network);
//}
//class mycellphone{
//
//    void callnumber(int phonenumber){
//        System.out.println("Calling"+phonenumber);
//
//    }
//    void pickcall(){
//        System.out.println("Connecting...");
//    }
//
//}
//class smartphone1 extends mycellphone implements wifi,camera{
////   public void record4k(){
////        System.out.println("recording in 4k from a smartphone");
////    }
//    public void takesnap(){
//        System.out.println("taking snap");
//    }
//    public void recordvideo(){
//        System.out.println("recording");
//    }
//    public String[] getnetworks(){
//        System.out.println("list");
//        String[] list={"nice","69"};
//        return list;
//    }
//   public void connecttonetworsk(String network){
//        System.out.println("COnnection to "+network);
//    }
//}
//public class default_methods {
//    public static void main(String[] args) {
//        smartphone1 s=new smartphone1();
//        String[] ar=s.getnetworks();
//        for (String items:ar)  {
//            System.out.println(items);
//        }
//        s.callnumber(32);
//        s.record4k();
//       // s.greet(); -->throws an error as private class
//
//
//    }
//}
