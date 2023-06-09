class Mobile {

    String company;
    int price;
    String model;
    String os;
    static String name;

    static {// Static Block
        System.out.println("It is a Static block");
    }

    public void display() {

        System.out.println(company + " : " + price + " : " + model + " : " + os + " : " + name);

    }

    public static void show1() {// Static Method

        System.out.println("It is a Static Method :");
    }
}

public class StaticExample {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");

        Mobile m1 = new Mobile();
        m1.company = "Apple";
        m1.price = 65000;
        m1.model = "Iphone 14";
        m1.os = "IOS";
        Mobile.name = "SmartPhone";

        Mobile m2 = new Mobile();
        m2.company = "Samsung";
        m2.price = 95000;
        m2.model = "Samsung S23";
        m2.os = "Android";
        Mobile.name = "SmartPhone";

        Mobile m3 = new Mobile();
        m3.company = "OnePlus";
        m3.price = 65000;
        m3.model = "OnePlus 9 Pro";
        m3.os = "Android";
        Mobile.name = "SmartPhone";

        // Mobile.name = "Siva Phone ";

        m1.display();
        m2.display();
        m3.display();

        // m1.show1(); It Give an Error
        // We call static method using class

        Mobile.show1();

    }

}
