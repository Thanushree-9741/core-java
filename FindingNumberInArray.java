class FindingNumberInArray{
     
    public static void main(String[] args){
          // inilization
        int no[] = new int[4];
       for(int i = 0; i < no.length; i++){
        no[i]= i + 1;
        }
          // Printing
        for(int i = 0; i < no.length; i++){
            System.out.println(no[i]);
        }
                // finding
            int number = 2;
         for(int i = 0; i < no.length; i++){

            if(no[i] == number){
                System.out.println("element found " + number + " at index " + i);
            }
         } 
        
         System.out.println("--------------------------------------------------");
         
         byte[] byteArray = new byte[4];
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (i + 1);
        }
        byte byteTarget = 3;
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println("byte: " + byteArray[i]);
            if (byteArray[i] == byteTarget) {
                System.out.println("Byte element found: " + byteTarget + " at index " + i);
            }
        }
System.out.println("--------------------------------------------------");
         short[] shortArray = new short[4];
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short) (i + 5);
        }
        short shortTarget = 6;
        for (int i = 0; i < shortArray.length; i++) {
            System.out.println("short: " + shortArray[i]);
            if (shortArray[i] == shortTarget) {
                System.out.println("Short element found: " + shortTarget + " at index " + i);
            }
        }
System.out.println("--------------------------------------------------");
        long[] longArray = new long[4];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = i + 100L;
        }
        long longTarget = 101L;
        for (int i = 0; i < longArray.length; i++) {
            System.out.println("long: " + longArray[i]);
            if (longArray[i] == longTarget) {
                System.out.println("Long element found: " + longTarget + " at index " + i);
            }
        }
System.out.println("--------------------------------------------------");
        float[] floatArray = new float[4];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = i + 1.5f;
        }
        float floatTarget = 2.5f;
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println("float: " + floatArray[i]);
            if (floatArray[i] == floatTarget) {
                System.out.println("Float element found: " + floatTarget + " at index " + i);
            }
        }
System.out.println("--------------------------------------------------");

        double[] doubleArray = new double[4];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i + 10.5;
        }
        double doubleTarget = 11.5;
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("double: " + doubleArray[i]);
            if (doubleArray[i] == doubleTarget) {
                System.out.println("Double element found: " + doubleTarget + " at index " + i);
            }
        }

System.out.println("--------------------------------------------------");
        char[] charArray = new char[4];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('a' + i);
        }
        char charTarget = 'c';
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("char: " + charArray[i]);
            if (charArray[i] == charTarget) {
                System.out.println("Char element found: '" + charTarget + "' at index " + i);
            }
        }

System.out.println("--------------------------------------------------");
        boolean[] boolArray = new boolean[4];
        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = (i % 2 == 0); // true, false, true, false
        }
        boolean boolTarget = false;
        for (int i = 0; i < boolArray.length; i++) {
            System.out.println("boolean: " + boolArray[i]);
            if (boolArray[i] == boolTarget) {
                System.out.println("Boolean element found: " + boolTarget + " at index " + i);
            }
        }
         

    }
}