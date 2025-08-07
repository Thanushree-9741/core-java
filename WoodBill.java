class WoodBill {
    private String customer;
    private String woodType;
    private double quantity;
    private double amount;

    public WoodBill() {
        customer = "Ramesh";
        woodType = "Teak";
        quantity = 10.5;
        amount = 15000.0;
    }

    public WoodBill(String customer) {
        this.customer = customer;
    }

    public WoodBill(String customer, String woodType) {
        this.customer = customer;
        this.woodType = woodType;
    }

    public WoodBill(String customer, String woodType, double quantity) {
        this.customer = customer;
        this.woodType = woodType;
        this.quantity = quantity;
    }

    public WoodBill(String customer, String woodType, double quantity, double amount) {
        this.customer = customer;
        this.woodType = woodType;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public String getWoodType() {
        return woodType;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }
}
