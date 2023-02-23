abstract class bank{
    abstract int getbalance();
}
class bank_a extends bank{
    int balance=0;
    void setbalance(int deposit){
        balance+=deposit;
    }

    int getbalance() {
        return balance;
    }
}
class bank_b extends bank{
    int balance=0;
    void setbalance(int deposit){
        balance+=deposit;
    }

    int getbalance() {
        return balance;
    }
}
class bank_c extends bank{
    int balance=0;
    void setbalance(int deposit){
        balance+=deposit;
    }

    int getbalance() {
        return balance;
    }
}
public class first
{
    public static void main(String[] args) {
    bank_a ba= new bank_a();
    bank_b bb=new bank_b();
    bank_c bc=new bank_c();
    ba.setbalance(100);
    bb.setbalance(150);
    bc.setbalance(200);
    System.out.println("Balance in bank A"+ba.getbalance());
    System.out.println("Balance in bank B"+bb.getbalance());
    System.out.println("Balance in bank C"+bc.getbalance());


    }
}
