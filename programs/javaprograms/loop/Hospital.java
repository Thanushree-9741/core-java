class Hospital {
    private String name;
    private String location;
    private String doctor;
    private int beds;

    public static String category;

    static {
        category = "Healthcare Service";
        System.out.println("Static Block in Hospital");
    }

    {
        System.out.println("Non-Static Block in Hospital");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }
}
