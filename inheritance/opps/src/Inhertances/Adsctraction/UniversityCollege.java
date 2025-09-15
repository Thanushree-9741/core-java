package Inhertances.Adsctraction;

public class UniversityCollege {



    public static void main(String[] args) {
        College coll = new College();
        coll.examination();
        coll.InternalTest();
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
