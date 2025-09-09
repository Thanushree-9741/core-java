package polymorpisum.runtime;

public class AccountRunner {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.getLoanAmount(200000f);


        HomeLoanAccount home = new HomeLoanAccount();

        home.getLoanAmount(20003f);

        VehicalLoanAccount vec = new VehicalLoanAccount();
        vec.getLoanAmount(233443f);

        }

    }

