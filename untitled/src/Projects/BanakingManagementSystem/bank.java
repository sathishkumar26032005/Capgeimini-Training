package Projects.BanakingManagementSystem;

    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

    public class bank {
        private Bankaccount[] Accounts = new Bankaccount[10];
        private int count = 0;

        public void addaccount(Bankaccount account) {
            this.Accounts[this.count++] = account;
        }

        public Bankaccount serachaccount(int accno) throws invalidaccount {
            for(int i = 0; i < this.count; ++i) {
                if (this.Accounts[i].getAccno() == accno) {
                    return this.Accounts[i];
                }
            }

            throw new invalidaccount("Account is not found");
        }
    }


