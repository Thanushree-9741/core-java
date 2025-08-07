class RationBill {
    private String familyHead;
    private int members;
    private double totalPrice;
    private String shopName;

    public RationBill() {
        familyHead = "Nagaraj";
        members = 4;
        totalPrice = 1200.0;
        shopName = "Govt Shop";
    }

    public RationBill(String familyHead) {
        this.familyHead = familyHead;
    }

    public RationBill(String familyHead, int members) {
        this.familyHead = familyHead;
        this.members = members;
    }

    public RationBill(String familyHead, int members, double totalPrice) {
        this.familyHead = familyHead;
        this.members = members;
        this.totalPrice = totalPrice;
    }

    public RationBill(String familyHead, int members, double totalPrice, String shopName) {
        this.familyHead = familyHead;
        this.members = members;
        this.totalPrice = totalPrice;
        this.shopName = shopName;
    }

    public String getFamilyHead() {
        return familyHead;
    }

    public int getMembers() {
        return members;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getShopName() {
        return shopName;
    }
}
