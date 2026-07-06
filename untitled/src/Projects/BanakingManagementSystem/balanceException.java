
package Projects.BanakingManagementSystem;
public class balanceException extends Exception{
    public balanceException(String mes){
        super(mes);
    }

    public static class bank {
        private Bankaccount[] Accounts;
        private int count;
        public bank(){
            Accounts =new Bankaccount[100];
            count=0;
        }
        public  void addaccount(Bankaccount account){
            Accounts[count++]=account;
            System.out.println("Account successfully created");
        }

        public Bankaccount serachaccount(int accno) throws invalidaccount {

            for (int i=0;i<count;i++){
                if(Accounts[i].getAccno()==accno){
                    return Accounts[i];
                }
            }

            throw new invalidaccount("Account is not found");
        }


    }
}
