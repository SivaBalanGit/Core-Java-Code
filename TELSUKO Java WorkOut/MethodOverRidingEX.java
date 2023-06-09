
class Calcu1 {

    public int add(int n1, int n2) {

        return n1 + n2;
    }
}

class AdvCalcu1 extends Calcu1 {

    public int add(int n1, int n2) {

        return n1 + n2 + 1;
    }

}

public class MethodOverRidingEX {

    public static void main(String[] args) {

        AdvCalcu1 obj = new AdvCalcu1();

        int r1 = obj.add(3, 5);
        System.out.println(r1);

    }

}
