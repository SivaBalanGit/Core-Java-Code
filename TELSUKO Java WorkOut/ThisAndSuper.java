//Every Constructor have a method its name is super(); keyword

//The super keyword is used. Call the constructor in super class but default constuctor only

class A {

    public A() {

        super();
        System.out.println("In A");
    }

    public A(int n) {

        super();
        System.out.println("In A Int :");

    }
}

class B extends A {

    public B() {

        super();
        System.out.println("In B");

    }

    public B(int n) {

        this();
        System.out.println("In B Int :");
    }

}

class ThisAndSuper {

    public static void main(String[] args) {

        // B obj = new B();
        B obj1 = new B(5);

    }

}
