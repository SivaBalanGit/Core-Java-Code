@FunctionalInterface
interface A {

    void display(int i);
}

public class LambdaEX {

    public static void main(String[] args) {

        A objA = (int i) -> System.out.println(" In display :" + i);

        objA.display(5);

    }

}
