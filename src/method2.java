public class method2
{
    //void return if no return used
    static void hello(){
        System.out.println("hello world");

    }
    static void change2(int x){
        //in case of integer or other data type the copy of original is passed to the method ,so it is not changed
        x=5;
    }
    static void change(int [] arr){
        //in case of array the reference is passed same is the case for object passing to methods
        arr[0]=98;
    }
    public static void main(String[] args) {
        hello();
        int c=6;
        change2(c);
        int[ ] marks={12,2,3,4};
        change(marks);
        System.out.println(marks[0]);
    }


}
