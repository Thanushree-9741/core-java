class Course {
    private String name;
    private String trainer;
    private int duration;  // in months
    private double fee;

    public static String category;

    static {
        category = "Education";
        System.out.println("Static Block in Course");
    }

    {
        System.out.println("Non-Static Block in Course");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
