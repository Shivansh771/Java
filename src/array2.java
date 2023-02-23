public class array2 {
    public static void main(String[] args) {
        int [] marks={32,34,54,65,54};
        System.out.println(marks.length);
        float [] mark={3.4f,43.3f,3,23,4323};
        String [] name={"LO","among","us"};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=(marks.length-1);i>=0;i--){
            System.out.println(marks[i]);

        }
        //for each loop

        for (int element:marks)
              {
                  System.out.println(element);

              }

    }
}
