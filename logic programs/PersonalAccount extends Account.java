class PersonalAccount extends Account {
    String type = "Personal Account";

    PersonalAccount(String name, int number, double balance) {
        super(name, number, balance);
    }

    void showAccountType() {
        System.out.println("Account Type: " + type);
    }
}

