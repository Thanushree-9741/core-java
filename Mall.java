class Mall {

    private String name;
    private String address;
    private KidsPlayBlock kids;


    public Mall(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setKids(KidsPlayBlock kid){
        kids = kid;
    }

    public KidsPlayBlock getKids(){
        return kids;
    }
}