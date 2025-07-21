class Bank1 {
    private String name;
    private String branch;
    private String manager;
    private int employees;

    public static String category;

    static {
        category = "Financial Services";
        System.out.println("Static Block in Bank");
    }

    {
        System.out.println("Non-Static Block in Bank");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }
}
