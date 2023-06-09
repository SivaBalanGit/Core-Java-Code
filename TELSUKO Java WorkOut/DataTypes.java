class DataTypes {

    public static void main(String[] args) {

        // Primitive Data Types
        byte num1 = 10;
        short num2 = 201;
        int num3 = 35621;
        long num4 = 1645258956;
        float num5 = 34.5f;
        double num6 = 66.5456d;
        char num7 = 'A';
        boolean bl = true;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(bl);

        // Non-Primitive Data Types
        String name = "John";
        System.out.println(name);

        // Array

        int[] num = new int[7];
        num[0] = 7;
        num[1] = 6;
        num[2] = 5;
        num[3] = 4;
        num[4] = 3;
        num[5] = 2;
        num[6] = 1;

        for (int i = 0; i <= num.length; i++) {
            System.out.println(num[i]);
        }

    }

}