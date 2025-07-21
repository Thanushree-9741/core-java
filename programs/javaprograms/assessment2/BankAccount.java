class BankAccount {
    static String accNumber = "SBIN0012345";
    static String holder = "Rahul Verma";
    static double balance = 85000.50;
    static String branch = "Mumbai";
    static String type = "Savings";

    public static double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public static boolean canWithdraw(double amount) {
        boolean withDraw = balance >= amount;
        return withDraw;
    }

    public static String getAccountType() {
        return type + " Account";
    }

    public static String getBankDetails() {
        return holder + " - " + branch;
    }

    public static double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}
