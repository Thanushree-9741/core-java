public class DoctorRunner {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[5];

        Doctor d1 = new Doctor();
        d1.setName("Dr. Anil");
        d1.setSpecialization("Cardiologist");
        d1.setExperience(15);
        d1.setHospital("Manipal");
        d1.setCity("Bangalore");
        doctors[0] = d1;

        Doctor d2 = new Doctor();
        d2.setName("Dr. Preeti");
        d2.setSpecialization("Dermatologist");
        d2.setExperience(8);
        d2.setHospital("Apollo");
        d2.setCity("Chennai");
        doctors[1] = d2;

        Doctor d3 = new Doctor();
        d3.setName("Dr. Nagesh");
        d3.setSpecialization("Neurologist");
        d3.setExperience(12);
        d3.setHospital("NIMHANS");
        d3.setCity("Bangalore");
        doctors[2] = d3;

        Doctor d4 = new Doctor();
        d4.setName("Dr. Shruthi");
        d4.setSpecialization("Gynecologist");
        d4.setExperience(10);
        d4.setHospital("Fortis");
        d4.setCity("Mysore");
        doctors[3] = d4;

        Doctor d5 = new Doctor();
        d5.setName("Dr. Ramesh");
        d5.setSpecialization("Orthopedic");
        d5.setExperience(20);
        d5.setHospital("Sakra");
        d5.setCity("Hyderabad");
        doctors[4] = d5;

        for (int i = 0; i < doctors.length; i++) {
            System.out.println("Doctor " + (i + 1) + " Details:");
            Doctor doc = doctors[i];
            System.out.println("Name: " + doc.getName());
            System.out.println("Specialization: " + doc.getSpecialization());
            System.out.println("Experience: " + doc.getExperience() + " years");
            System.out.println("Hospital: " + doc.getHospital());
            System.out.println("City: " + doc.getCity());
            System.out.println("----------------------------------");
        }
    }
}
