package Projects.BanakingManagementSystem;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        balanceException.bank Bank=new balanceException.bank();
        try {
            while (true) {
                System.out.println("1. Create Account");
                System.out.println("2. Check Balance");
                System.out.println("3. Deposit");
                System.out.println("4. Withdraw");
                System.out.println("5. Transfer One To Another");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = ob.nextInt();
                switch (choice) {
                    case 1:
//                        System.out.print("Enter Account Number: ");
//                        int accountNumber = ob.nextInt();

                        System.out.print("Enter the Deposit Amount : ");
                        double balance = ob.nextDouble();
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolderName = ob.next();
                        Bankaccount obj=new Bankaccount(accountHolderName, balance);
                        Bank.addaccount(obj);
                        obj.display();
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accountNumber2 = ob.nextInt();
                        Bankaccount bal = Bank.serachaccount(accountNumber2);
                        bal.display();
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accountNumber3 = ob.nextInt();
                        System.out.print("Enter Amount: ");
                        double amount = ob.nextDouble();
                        Bankaccount sendob = Bank.serachaccount(accountNumber3);
                        sendob.deposit(amount);
                        sendob.display();
                        break;
                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accountNumber4 = ob.nextInt();
                        System.out.print("Enter Amount: ");
                        double amount2 = ob.nextDouble();
                        Bankaccount sendobj = Bank.serachaccount(accountNumber4);
                        sendobj.with(amount2);
                        sendobj.display();
                        break;
                    case 5:
                        System.out.print("Enter Sender Account Number: ");
                        int s = ob.nextInt();
                        System.out.print("Enter Receiver Account Number: ");
                        int r = ob.nextInt();
                        System.out.print("Enter Amount: ");
                        double amo = ob.nextDouble();
                        Bankaccount sendo = Bank.serachaccount(s);
                        Bankaccount recioverobj = Bank.serachaccount(r);
                        sendo.transfer(recioverobj, amo);
                        sendo.display();
                        recioverobj.display();
                        break;

                    case 6:
                        System.out.println("System will be Exit ?");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
        catch (invalidamount an){
            System.out.println("Invalid Amonunt");
        }
        catch (invalidaccount acc){
            System.out.println("Account is Not Found");
        }
        catch (dailylimit dai){
            System.out.println("Daily Limite is Over");
        }
        catch (balanceException bal){
            System.out.println("Invalid balance");
        }

    }
}