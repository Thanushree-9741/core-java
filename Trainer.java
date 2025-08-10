class Trainer{

    String name;
    String domain;
    long mobile;
    int id;
    String address;


    public Trainer(String name,String domain,String address, long mobile, int id){

        this.name = name;
        this.domain = domain;
        this.address = address;
        this.mobile = mobile;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getDomain(){
        return domain;
    }

    public String getAddress(){
        return address;
    }

    public long getMobile(){
        return mobile;
    }

    public int getId(){
        return id;
    }
}