class Tailor{

    private String name;
    private long mobile;
    private String address;
    private int homeNo;



    public Tailor(){
        name = "Manju";
        mobile = 9988006677L;
        address = "kolar";
        homeNo = 7;
        
    }

    public Tailor(String name){
        this.name = name;
    }

    public Tailor(String name, long mobile){
        this.name = name;
        this.mobile = mobile;
    }

    public Tailor(String name, long mobile, String address){
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public Tailor(String name, long mobile, String address, int homeNo){
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.homeNo = homeNo;
    }

    public String getName(){
        return name;
    }

    public long getMobile(){
        return mobile;
    }

    public String getAddress(){
        return address;
    }

    public int getHomeNo(){
        return homeNo;
    }
}