// final - variable, method, class

final class CheckFinalA { // final class

    public final void show() { // final method

        System.out.println("In Final A show :");
    }

    public void add(int n1, int n2) {

        System.out.println(n1 + n2);
    }

}

/*
 * class CheckFinalB extends CheckFinalA { // final class will not extends in
 * this case
 * 
 * public void show(){
 * 
 * System.out.println("In Final B show :")
 * }
 * public void sub(int n1, int n2) {
 * 
 * System.out.println(n1 - n2);
 * }
 * }
 */

public class FinalKeyWordEX {

    public static void main(String[] args) {

        // final int num = 5; // final variable cannot be change
        // num = 3;
        // System.out.println(num);

        CheckFinalA finalA = new CheckFinalA();

        finalA.add(10, 15);
        finalA.show();

        // CheckFinalB finalB = new CheckFinalB();

        // finalB.sub(3, 1);

    }

}
