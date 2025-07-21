class College{
    static String name = "Sdc";
    static String address = "Kolar";
    static char block ='c';
    static float fees = 10000f;
    static long mobile = 9987657343L; 
    public static void main(String[] args){
    
        String collegeName = nameOfCollege();
        System.out.println(collegeName);

        String collegeAddr = addressOfCollege();
        System.out.println(collegeAddr);

        char collegeBlock = blockOfCollege();
        System.out.println(collegeBlock);
        
        float collegeFees = feesOfCollege();
        System.out.println(collegeFees);

        long collegeMobile = mobileOfCollege();
        System.out.println(collegeMobile);

    }

    public static String nameOfCollege(){
        return  name;
    }

    public static String addressOfCollege(){
        return  address;
    }

    public static char blockOfCollege(){
        return  block;
    }

    public static float feesOfCollege(){
        return  fees;
    }

    public static long mobileOfCollege(){
        return  mobile;
    }

}