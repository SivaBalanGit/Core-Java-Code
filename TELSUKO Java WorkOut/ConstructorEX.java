
class Human1 {

    private int age1;
    private String name1;

    public Human1() { // Default Constructor

        System.out.println(" When we create new Object for class Human1 the Constructor will CALL :");

        age1 = 21;
        name1 = "JEEVA";

    }

    public Human1(int a, String n) { // Parameterizedruct Constor

        age1 = a;
        name1 = n;

    }

    public int getAge1() {

        return age1;
    }

    public void setAge1(int age1) {

        this.age1 = age1;
    }

    public String getName1() {

        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

}

public class ConstructorEX {

    public static void main(String[] args) {

        Human1 obj = new Human1();
        Human1 obj1 = new Human1(20, "SIVA");

        // obj.setAge1(30);
        // obj.setName1("Ganesh");

        System.out.println(obj.getName1() + " : " + obj.getAge1());
        System.out.println(obj1.getName1() + " : " + obj1.getAge1());

    }

}
