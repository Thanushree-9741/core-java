class CountryRunner1{

    public static void main(String[] args){

        Country cont = new Country();
        cont.setName("India");

        System.out.println("Country name is " + cont.getName());
System.out.println("--------------------------------------------------------------------");
        cont.setNumberofStates(28);

        System.out.println("in india no of states" + cont.getNumberOfStates());
System.out.println("--------------------------------------------------------------------");
        cont.setPrimeMinister("Narenda Modi");

        System.out.println("India prime minister is: " + cont.getPrimeMinister());

        

        System.out.println("--------------------------------------------------------------------");
        
        
        State[] states = new State[28];

        State s1 = new State();
        s1.setName("Karnataka");
        s1.setChiefMinister("Siddaramaiah");
        s1.setNoOfDistrics(31);
        s1.setNoOfMLAS(224);
        states[0] = s1;
        System.out.println("Karnataka Chief Minister is " + s1.getChiefMinister());
        System.out.println("In Karnataka total districts: " + s1.getNoOfDistrics());
        System.out.println("Karnataka total MLAs: " + s1.getNoOfMLAS());

        State s2 = new State();
        s2.setName("Andhra Pradesh");
        s2.setChiefMinister("N. Chandrababu Naidu");
        s2.setNoOfDistrics(26);
        s2.setNoOfMLAS(175);
        states[1] = s2;
        System.out.println("Andhra Pradesh Chief Minister is " + s2.getChiefMinister());
        System.out.println("In Andhra Pradesh total districts: " + s2.getNoOfDistrics());
        System.out.println("Andhra Pradesh total MLAs: " + s2.getNoOfMLAS());

        State s3 = new State();
        s3.setName("Tamil Nadu");
        s3.setChiefMinister("M. K. Stalin");
        s3.setNoOfDistrics(38);
        s3.setNoOfMLAS(234);
        states[2] = s3;
        System.out.println("Tamil Nadu Chief Minister is " + s3.getChiefMinister());
        System.out.println("In Tamil Nadu total districts: " + s3.getNoOfDistrics());
        System.out.println("Tamil Nadu total MLAs: " + s3.getNoOfMLAS());

        State s4 = new State();
        s4.setName("Telangana");
        s4.setChiefMinister("A. Revanth Reddy");
        s4.setNoOfDistrics(33);
        s4.setNoOfMLAS(119);
        states[3] = s4;
        System.out.println("Telangana Chief Minister is " + s4.getChiefMinister());
        System.out.println("In Telangana total districts: " + s4.getNoOfDistrics());
        System.out.println("Telangana total MLAs: " + s4.getNoOfMLAS());

        State s5 = new State();
        s5.setName("Maharashtra");
        s5.setChiefMinister("Eknath Shinde");
        s5.setNoOfDistrics(36);
        s5.setNoOfMLAS(288);
        states[4] = s5;
        System.out.println("Maharashtra Chief Minister is " + s5.getChiefMinister());
        System.out.println("In Maharashtra total districts: " + s5.getNoOfDistrics());
        System.out.println("Maharashtra total MLAs: " + s5.getNoOfMLAS());

        State s6 = new State();
        s6.setName("Gujarat");
        s6.setChiefMinister("Bhupendra Patel");
        s6.setNoOfDistrics(33);
        s6.setNoOfMLAS(182);
        states[5] = s6;
        System.out.println("Gujarat Chief Minister is " + s6.getChiefMinister());
        System.out.println("In Gujarat total districts: " + s6.getNoOfDistrics());
        System.out.println("Gujarat total MLAs: " + s6.getNoOfMLAS());

        State s7 = new State();
        s7.setName("Rajasthan");
        s7.setChiefMinister("Bhajan Lal Sharma");
        s7.setNoOfDistrics(50);
        s7.setNoOfMLAS(200);
        states[6] = s7;
        System.out.println("Rajasthan Chief Minister is " + s7.getChiefMinister());
        System.out.println("In Rajasthan total districts: " + s7.getNoOfDistrics());
        System.out.println("Rajasthan total MLAs: " + s7.getNoOfMLAS());

        State s8 = new State();
        s8.setName("Uttar Pradesh");
        s8.setChiefMinister("Yogi Adityanath");
        s8.setNoOfDistrics(75);
        s8.setNoOfMLAS(403);
        states[7] = s8;
        System.out.println("Uttar Pradesh Chief Minister is " + s8.getChiefMinister());
        System.out.println("In Uttar Pradesh total districts: " + s8.getNoOfDistrics());
        System.out.println("Uttar Pradesh total MLAs: " + s8.getNoOfMLAS());

        State s9 = new State();
        s9.setName("Madhya Pradesh");
        s9.setChiefMinister("Mohan Yadav");
        s9.setNoOfDistrics(55);
        s9.setNoOfMLAS(230);
        states[8] = s9;
        System.out.println("Madhya Pradesh Chief Minister is " + s9.getChiefMinister());
        System.out.println("In Madhya Pradesh total districts: " + s9.getNoOfDistrics());
        System.out.println("Madhya Pradesh total MLAs: " + s9.getNoOfMLAS());

        State s10 = new State();
        s10.setName("Kerala");
        s10.setChiefMinister("Pinarayi Vijayan");
        s10.setNoOfDistrics(14);
        s10.setNoOfMLAS(140);
        states[9] = s10;
        System.out.println("Kerala Chief Minister is " + s10.getChiefMinister());
        System.out.println("In Kerala total districts: " + s10.getNoOfDistrics());
        System.out.println("Kerala total MLAs: " + s10.getNoOfMLAS());

        State s11 = new State();
        s11.setName("Punjab");
        s11.setChiefMinister("Bhagwant Mann");
        s11.setNoOfDistrics(23);
        s11.setNoOfMLAS(117);
        states[10] = s11;
        System.out.println("Punjab Chief Minister is " + s11.getChiefMinister());
        System.out.println("In Punjab total districts: " + s11.getNoOfDistrics());
        System.out.println("Punjab total MLAs: " + s11.getNoOfMLAS());

        State s12 = new State();
        s12.setName("Haryana");
        s12.setChiefMinister("Nayab Singh Saini");
        s12.setNoOfDistrics(22);
        s12.setNoOfMLAS(90);
        states[11] = s12;
        System.out.println("Haryana Chief Minister is " + s12.getChiefMinister());
        System.out.println("In Haryana total districts: " + s12.getNoOfDistrics());
        System.out.println("Haryana total MLAs: " + s12.getNoOfMLAS());

        State s13 = new State();
        s13.setName("Chhattisgarh");
        s13.setChiefMinister("Vishnu Deo Sai");
        s13.setNoOfDistrics(33);
        s13.setNoOfMLAS(90);
        states[12] = s13;
        System.out.println("Chhattisgarh Chief Minister is " + s13.getChiefMinister());
        System.out.println("In Chhattisgarh total districts: " + s13.getNoOfDistrics());
        System.out.println("Chhattisgarh total MLAs: " + s13.getNoOfMLAS());

        State s14 = new State();
        s14.setName("Jharkhand");
        s14.setChiefMinister("Hemant Soren");
        s14.setNoOfDistrics(24);
        s14.setNoOfMLAS(81);
        states[13] = s14;
        System.out.println("Jharkhand Chief Minister is " + s14.getChiefMinister());
        System.out.println("In Jharkhand total districts: " + s14.getNoOfDistrics());
        System.out.println("Jharkhand total MLAs: " + s14.getNoOfMLAS());

        State s15 = new State();
        s15.setName("Bihar");
        s15.setChiefMinister("Nitish Kumar");
        s15.setNoOfDistrics(38);
        s15.setNoOfMLAS(243);
        states[14] = s15;
        System.out.println("Bihar Chief Minister is " + s15.getChiefMinister());
        System.out.println("In Bihar total districts: " + s15.getNoOfDistrics());
        System.out.println("Bihar total MLAs: " + s15.getNoOfMLAS());

        State s16 = new State();
        s16.setName("West Bengal");
        s16.setChiefMinister("Mamata Banerjee");
        s16.setNoOfDistrics(23);
        s16.setNoOfMLAS(294);
        states[15] = s16;
        System.out.println("West Bengal Chief Minister is " + s16.getChiefMinister());
        System.out.println("In West Bengal total districts: " + s16.getNoOfDistrics());
        System.out.println("West Bengal total MLAs: " + s16.getNoOfMLAS());

        State s17 = new State();
        s17.setName("Odisha");
        s17.setChiefMinister("Naveen Patnaik");
        s17.setNoOfDistrics(30);
        s17.setNoOfMLAS(147);
        states[16] = s17;
        System.out.println("Odisha Chief Minister is " + s17.getChiefMinister());
        System.out.println("In Odisha total districts: " + s17.getNoOfDistrics());
        System.out.println("Odisha total MLAs: " + s17.getNoOfMLAS());

        State s18 = new State();
        s18.setName("Goa");
        s18.setChiefMinister("Pramod Sawant");
        s18.setNoOfDistrics(2);
        s18.setNoOfMLAS(40);
        states[17] = s18;
        System.out.println("Goa Chief Minister is " + s18.getChiefMinister());
        System.out.println("In Goa total districts: " + s18.getNoOfDistrics());
        System.out.println("Goa total MLAs: " + s18.getNoOfMLAS());

                State s19 = new State();
        s19.setName("Uttarakhand");
        s19.setChiefMinister("Pushkar Singh Dhami");
        s19.setNoOfDistrics(13);
        s19.setNoOfMLAS(70);
        states[18] = s19;
        System.out.println("Uttarakhand Chief Minister is " + s19.getChiefMinister());
        System.out.println("In Uttarakhand total districts: " + s19.getNoOfDistrics());
        System.out.println("Uttarakhand total MLAs: " + s19.getNoOfMLAS());

        State s20 = new State();
        s20.setName("Himachal Pradesh");
        s20.setChiefMinister("Sukhvinder Singh Sukhu");
        s20.setNoOfDistrics(12);
        s20.setNoOfMLAS(68);
        states[19] = s20;
        System.out.println("Himachal Pradesh Chief Minister is " + s20.getChiefMinister());
        System.out.println("In Himachal Pradesh total districts: " + s20.getNoOfDistrics());
        System.out.println("Himachal Pradesh total MLAs: " + s20.getNoOfMLAS());

        State s21 = new State();
        s21.setName("Assam");
        s21.setChiefMinister("Himanta Biswa Sarma");
        s21.setNoOfDistrics(35);
        s21.setNoOfMLAS(126);
        states[20] = s21;
        System.out.println("Assam Chief Minister is " + s21.getChiefMinister());
        System.out.println("In Assam total districts: " + s21.getNoOfDistrics());
        System.out.println("Assam total MLAs: " + s21.getNoOfMLAS());

        State s22 = new State();
        s22.setName("Sikkim");
        s22.setChiefMinister("Prem Singh Tamang");
        s22.setNoOfDistrics(6);
        s22.setNoOfMLAS(32);
        states[21] = s22;
        System.out.println("Sikkim Chief Minister is " + s22.getChiefMinister());
        System.out.println("In Sikkim total districts: " + s22.getNoOfDistrics());
        System.out.println("Sikkim total MLAs: " + s22.getNoOfMLAS());

        State s23 = new State();
        s23.setName("Arunachal Pradesh");
        s23.setChiefMinister("Pema Khandu");
        s23.setNoOfDistrics(25);
        s23.setNoOfMLAS(60);
        states[22] = s23;
        System.out.println("Arunachal Pradesh Chief Minister is " + s23.getChiefMinister());
        System.out.println("In Arunachal Pradesh total districts: " + s23.getNoOfDistrics());
        System.out.println("Arunachal Pradesh total MLAs: " + s23.getNoOfMLAS());

        State s24 = new State();
        s24.setName("Nagaland");
        s24.setChiefMinister("Neiphiu Rio");
        s24.setNoOfDistrics(16);
        s24.setNoOfMLAS(60);
        states[23] = s24;
        System.out.println("Nagaland Chief Minister is " + s24.getChiefMinister());
        System.out.println("In Nagaland total districts: " + s24.getNoOfDistrics());
        System.out.println("Nagaland total MLAs: " + s24.getNoOfMLAS());

        State s25 = new State();
        s25.setName("Manipur");
        s25.setChiefMinister("N. Biren Singh");
        s25.setNoOfDistrics(16);
        s25.setNoOfMLAS(60);
        states[24] = s25;
        System.out.println("Manipur Chief Minister is " + s25.getChiefMinister());
        System.out.println("In Manipur total districts: " + s25.getNoOfDistrics());
        System.out.println("Manipur total MLAs: " + s25.getNoOfMLAS());

        State s26 = new State();
        s26.setName("Meghalaya");
        s26.setChiefMinister("Conrad Sangma");
        s26.setNoOfDistrics(12);
        s26.setNoOfMLAS(60);
        states[25] = s26;
        System.out.println("Meghalaya Chief Minister is " + s26.getChiefMinister());
        System.out.println("In Meghalaya total districts: " + s26.getNoOfDistrics());
        System.out.println("Meghalaya total MLAs: " + s26.getNoOfMLAS());

        State s27 = new State();
        s27.setName("Tripura");
        s27.setChiefMinister("Manik Saha");
        s27.setNoOfDistrics(8);
        s27.setNoOfMLAS(60);
        states[26] = s27;
        System.out.println("Tripura Chief Minister is " + s27.getChiefMinister());
        System.out.println("In Tripura total districts: " + s27.getNoOfDistrics());
        System.out.println("Tripura total MLAs: " + s27.getNoOfMLAS());

        State s28 = new State();
        s28.setName("Mizoram");
        s28.setChiefMinister("Lalduhoma");
        s28.setNoOfDistrics(11);
        s28.setNoOfMLAS(40);
        states[27] = s28;
        System.out.println("Mizoram Chief Minister is " + s28.getChiefMinister());
        System.out.println("In Mizoram total districts: " + s28.getNoOfDistrics());
        System.out.println("Mizoram total MLAs: " + s28.getNoOfMLAS());







System.out.println("--------------------------------------------------------------------");

        cont.setStates(states);

        System.out.println("country names and it's states");

        State[] countryStates = cont.getStates();

        for(int i = 0; i<countryStates.length; i++){
            State state = countryStates[i];
            if(state !=null) {
                System.out.println("The states are "+ i + ") " + state.getName());
            }
        }

        
    }
}