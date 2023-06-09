class Calculator {

    public int add(int n1, int n2, int n3) {

        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {

        return n1 + n2;
    }
}

public class MethodOverLoadingEX {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int m1 = obj.add(11, 15, 10);
        System.out.println(m1);

        int m2 = obj.add(25, 12);
        System.out.println(m2);

    }

}
