class rect{
    private  int len;
    private int bredth;

    public rect(int len, int bredth) {
        this.len = len;
        this.bredth = bredth;
    }
    public rect() {
        this.len = 1;
        this.bredth = 2;
    }

    public int getLen() {
        return len;
    }

    public int getBredth() {
        return bredth;
    }
}
public class rectangle {
    public static void main(String[] args) {
        rect rect=new rect();
        System.out.println(rect.getBredth());

    }
}
