class Calcu {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {

        return n1 - n2;
    }
}

class AdvCalcu extends Calcu {

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public double div(int n1, int n2) {
        return n1 / n2;
    }

    public double mod(int n1, int n2) {
        return n1 % n2;
    }
}

public class InheritanceEX {

    public static void main(String[] args) {

        AdvCalcu obj = new AdvCalcu();

        System.out.println("Addition   : " + obj.add(12, 6));
        System.out.println("Subraction : " + obj.sub(12, 6));
        System.out.println("Multiple   : " + obj.mul(5, 5));
        System.out.println("Division   : " + obj.div(10, 2));
        System.out.println("Modulo     : " + obj.mod(10, 3));

    }

}
