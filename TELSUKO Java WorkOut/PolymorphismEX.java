class Ao {

    public void show() {

        System.out.println("In Ao show :");
    }
}

class Bo extends Ao {

    public void show() {

        System.out.println("In Bo show :");
    }
}

class Co extends Ao {

    public void show() {

        System.out.println("In Co show :");
    }
}

public class PolymorphismEX {
    public static void main(String[] args) {

        Ao obj11 = new Ao();
        obj11.show();

        obj11 = new Bo();
        obj11.show();

        obj11 = new Co();
        obj11.show();
    }
}