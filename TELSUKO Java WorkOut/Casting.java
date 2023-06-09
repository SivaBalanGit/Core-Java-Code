class Casting {

    public static void main(String[] args) {

        byte i = 15;
        int j = 23;
        j = i;
        System.out.println(j);

        byte a = 12;
        int b = 398;

        a = (byte) b;
        System.out.println(a);
    }
}