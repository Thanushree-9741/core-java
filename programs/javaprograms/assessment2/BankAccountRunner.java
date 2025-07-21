class BankAccountRunner {
    public static void main(String[] args) {
        System.out.println("Account Number: " + BankAccount.accNumber);
        System.out.println("Holder: " + BankAccount.holder);
        System.out.println("Balance: " + BankAccount.balance);
        System.out.println("Branch: " + BankAccount.branch);
        System.out.println("Type: " + BankAccount.type);

        
        double balance = BankAccount.deposit(5000);
        System.out.println("New Balance: " + balance );
         
        boolean withDraw = BankAccount.canWithdraw(10000);
        System.out.println("Can Withdraw 10K: " + withDraw);
        
        System.out.println("Account Type: " + BankAccount.getAccountType());
        System.out.println("Bank Details: " + BankAccount.getBankDetails());
        System.out.println("Interest (5%): " + BankAccount.calculateInterest(5));
    }
}
