class Bank {
    String bankName;
    int branchCode;
    String location;
    String managerName;
    double totalAssets;

    public static void main(String[] args) {
        // 1
        Bank b1 = new Bank();
        b1.bankName = "SBI";
        System.out.println(b1.bankName);
        b1.setBankName("HDFC");
        System.out.println(b1.bankName);

        // 2
        Bank b2 = new Bank();
        b2.branchCode = 101;
        System.out.println(b2.branchCode);
        b2.setBranchCode(102);
        System.out.println(b2.branchCode);

        // 3
        Bank b3 = new Bank();
        b3.location = "Bangalore";
        System.out.println(b3.location);
        b3.setLocation("Mysore");
        System.out.println(b3.location);

        // 4
        Bank b4 = new Bank();
        b4.managerName = "Ramesh";
        System.out.println(b4.managerName);
        b4.setManagerName("Suresh");
        System.out.println(b4.managerName);

        // 5
        Bank b5 = new Bank();
        b5.totalAssets = 1000000.00;
        System.out.println(b5.totalAssets);
        b5.setTotalAssets(2000000.00);
        System.out.println(b5.totalAssets);

        // 6
        Bank b6 = new Bank();
        b6.bankName = "Canara Bank";
        System.out.println(b6.bankName);
        b6.setBankNameAgain("Axis Bank");
        System.out.println(b6.bankName);

        // 7
        Bank b7 = new Bank();
        b7.branchCode = 103;
        System.out.println(b7.branchCode);
        b7.setBranchCodeAgain(104);
        System.out.println(b7.branchCode);

        // 8
        Bank b8 = new Bank();
        b8.location = "Chennai";
        System.out.println(b8.location);
        b8.setLocationAgain("Hyderabad");
        System.out.println(b8.location);

        // 9
        Bank b9 = new Bank();
        b9.managerName = "Deepa";
        System.out.println(b9.managerName);
        b9.setManagerNameAgain("Lakshmi");
        System.out.println(b9.managerName);

        // 10
        Bank b10 = new Bank();
        b10.totalAssets = 500000.00;
        System.out.println(b10.totalAssets);
        b10.setTotalAssetsAgain(750000.00);
        System.out.println(b10.totalAssets);
    }

    public void setBankName(String name) {
        bankName = name;
    }

    public void setBankNameAgain(String name) {
        bankName = name;
    }

    public void setBranchCode(int code) {
        branchCode = code;
    }

    public void setBranchCodeAgain(int code) {
        branchCode = code;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public void setLocationAgain(String loc) {
        location = loc;
    }

    public void setManagerName(String mname) {
        managerName = mname;
    }

    public void setManagerNameAgain(String mname) {
        managerName = mname;
    }

    public void setTotalAssets(double assets) {
        totalAssets = assets;
    }

    public void setTotalAssetsAgain(double assets) {
        totalAssets = assets;
    }
}
