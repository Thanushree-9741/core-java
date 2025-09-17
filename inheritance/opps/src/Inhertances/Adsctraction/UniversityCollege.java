package Inhertances.Adsctraction;

public class UniversityCollege {



    public static void main(String[] args) {
        College coll = new College("SDC","bnu");
        coll.examination();
        coll.InternalTest();
        System.out.println("the college name " + coll.name);
        System.out.println("the univercity" + coll.universityName);
// upcasting
        University uni = new College();

        uni.examination();
// down casting
        if ( uni instanceof College ){
            College college = (College) uni;
            college.InternalTest();
            college.examination();

        }


    }
}
