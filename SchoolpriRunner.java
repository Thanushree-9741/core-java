class SchoolpriRunner{

    public static void main(String[] args){

        SchoolInfo info = new SchoolInfo("Mahila samaja school", "Kolar", 9988776655L);
System.out.println("School details");
System.out.println("---------------");
        System.out.println(info.getName());
         System.out.println(info.getAddress());
          System.out.println(info.getMobileNo());

System.out.println("");

          SchoolPri pri = new SchoolPri("RaviKumar", 9977665544L, "Mulbagal");
            
            info.setSchool(pri);
System.out.println("SchoolPrincipal details");
System.out.println("-----------------------");
            SchoolPri pri1 = info.getSchool();

            System.out.println(pri1.getName());
            System.out.println(pri1.getMobile());
            System.out.println(pri1.getAddress());
            

          }
    }
