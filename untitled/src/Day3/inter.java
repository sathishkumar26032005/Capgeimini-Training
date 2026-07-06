interface Payment{
    void pay(double amount);
    void showpayment();
}
class cardpayment implements  Payment{
    public void pay(double amount){
        System.out.print("paid rs "+amount+"using card");
    }
    public void showpayment(){
        System.out.println("payment method card");
    }
}
class UPI implements Payment{
    public void pay(double amount){
        System.out.print("paid rs "+amount+"using UPI");
    }
    public void showpayment(){
        System.out.println("payment method UPI");
    }
}
public class inter {
    public static void main(String[] args){
        Payment payment=new cardpayment();
        payment.showpayment();
        payment.pay(2500);
        Payment pay=new UPI();
        pay.showpayment();
        pay.pay(2600);
    }
}