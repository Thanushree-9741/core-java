class SchoolInfo{

    private String name;
    private String address;
    private long mobileNo;
    private SchoolPri school;


    public SchoolInfo(String name, String address, long mobileNo ){
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
       
    }


    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public long getMobileNo(){
        return mobileNo;
    }

    public void setSchool(SchoolPri school){
    this.school = school;
    }

    public SchoolPri getSchool(){
        return school;
    }


}