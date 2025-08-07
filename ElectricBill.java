class ElectricBill {
    private String customerName;
    private int unitsConsumed;
    private double billAmount;
    private String area;

    public ElectricBill() {
        customerName = "Unknown";
        unitsConsumed = 100;
        billAmount = 500.0;
        area = "City";
    }

    public ElectricBill(String customerName) {
        this.customerName = customerName;
    }

    public ElectricBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public ElectricBill(String customerName, int unitsConsumed, double billAmount) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
    }

    public ElectricBill(String customerName, int unitsConsumed, double billAmount, String area) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
        this.area = area;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public String getArea() {
        return area;
    }
}
