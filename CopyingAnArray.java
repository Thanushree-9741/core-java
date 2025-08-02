class CopyingAnArray {

    public static void main(String[] args) {

        // 1. int array
        int[] pen = new int[5];
        for (int i = 0; i < pen.length; i++) {
            pen[i] = (i + 5) % 5;
        }
        System.out.println("Before copy (int):");
        for (int value : pen) {
            System.out.println(value);
        }

        int[] copyPen = new int[pen.length];
        for (int i = 0; i < pen.length; i++) {
            copyPen[i] = pen[i];
        }
        System.out.println("After copy (int):");
        for (int value : copyPen) {
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------");

        // 2. byte array
        byte[] byteArr = new byte[5];
        for (int i = 0; i < byteArr.length; i++) {
            byteArr[i] = (byte) (i + 2);
        }
        System.out.println("Before copy (byte):");
        for (byte b : byteArr) {
            System.out.println(b);
        }

        byte[] copyByte = new byte[byteArr.length];
        for (int i = 0; i < byteArr.length; i++) {
            copyByte[i] = byteArr[i];
        }
        System.out.println("After copy (byte):");
        for (byte b : copyByte) {
            System.out.println(b);
        }

        System.out.println("--------------------------------------------------");

        // 3. short array
        short[] shortArr = new short[5];
        for (int i = 0; i < shortArr.length; i++) {
            shortArr[i] = (short) (i + 10);
        }
        System.out.println("Before copy (short):");
        for (short s : shortArr) {
            System.out.println(s);
        }

        short[] copyShort = new short[shortArr.length];
        for (int i = 0; i < shortArr.length; i++) {
            copyShort[i] = shortArr[i];
        }
        System.out.println("After copy (short):");
        for (short s : copyShort) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------------");

        // 4. long array
        long[] longArr = new long[5];
        for (int i = 0; i < longArr.length; i++) {
            longArr[i] = i + 100L;
        }
        System.out.println("Before copy (long):");
        for (long l : longArr) {
            System.out.println(l);
        }

        long[] copyLong = new long[longArr.length];
        for (int i = 0; i < longArr.length; i++) {
            copyLong[i] = longArr[i];
        }
        System.out.println("After copy (long):");
        for (long l : copyLong) {
            System.out.println(l);
        }

        System.out.println("--------------------------------------------------");

        // 5. float array
        float[] floatArr = new float[5];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = i + 1.1f;
        }
        System.out.println("Before copy (float):");
        for (float f : floatArr) {
            System.out.println(f);
        }

        float[] copyFloat = new float[floatArr.length];
        for (int i = 0; i < floatArr.length; i++) {
            copyFloat[i] = floatArr[i];
        }
        System.out.println("After copy (float):");
        for (float f : copyFloat) {
            System.out.println(f);
        }

        System.out.println("--------------------------------------------------");

        // 6. double array
        double[] doubleArr = new double[5];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = i + 10.5;
        }
        System.out.println("Before copy (double):");
        for (double d : doubleArr) {
            System.out.println(d);
        }

        double[] copyDouble = new double[doubleArr.length];
        for (int i = 0; i < doubleArr.length; i++) {
            copyDouble[i] = doubleArr[i];
        }
        System.out.println("After copy (double):");
        for (double d : copyDouble) {
            System.out.println(d);
        }

        System.out.println("--------------------------------------------------");

        // 7. char array
        char[] charArr = new char[5];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) ('a' + i);
        }
        System.out.println("Before copy (char):");
        for (char c : charArr) {
            System.out.println(c);
        }

        char[] copyChar = new char[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            copyChar[i] = charArr[i];
        }
        System.out.println("After copy (char):");
        for (char c : copyChar) {
            System.out.println(c);
        }

        System.out.println("--------------------------------------------------");

        // 8. boolean array
        boolean[] boolArr = new boolean[5];
        for (int i = 0; i < boolArr.length; i++) {
            boolArr[i] = (i % 2 == 0); // true, false, true, false, true
        }
        System.out.println("Before copy (boolean):");
        for (boolean b : boolArr) {
            System.out.println(b);
        }

        boolean[] copyBool = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            copyBool[i] = boolArr[i];
        }
        System.out.println("After copy (boolean):");
        for (boolean b : copyBool) {
            System.out.println(b);
        }
    }
}
