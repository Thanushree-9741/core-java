class Account {
    String accountHolder;
    int accountNumber;
    double balance;

    Account(String name, int number, double balance) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


