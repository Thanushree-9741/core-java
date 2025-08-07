class SchoolPri{

    private String name;
    private long mobile;
    private String address;


    public SchoolPri(String name, long mobile, String address){
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public long getMobile(){
        return mobile;
    }
}