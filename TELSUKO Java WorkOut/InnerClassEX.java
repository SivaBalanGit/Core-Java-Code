class AA {

    int age;

    public void show1() {

        System.out.println("In A Class");
    }

    class BB {

        public void display() {

            System.out.println("In B Class");
        }

    }
}

public class InnerClassEX {

    public static void main(String[] args) {

        AA obj = new AA();

        obj.show1();

        AA.BB obj1 = obj.new BB();

        obj1.display();

    }

}
