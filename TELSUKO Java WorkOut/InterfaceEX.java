interface Demo { // interface

    // Every Variable inside interface default final and static

    int age = 22;
    String name = "Villupuram";

    void show(); // the all methods in interface default it has public abstract

    void inter(); // like this
}

interface Don extends Demo { // interface - nterface -> use extends

    void config();
}

class Original implements Don { // class - interface -> use implements

    public void inter() {

        System.out.println("In Inter :");
    }

    public void show() {

        System.out.println("In Show :");
    }

    public void config() {
        System.out.println("In Config :");
    }

}

public class InterfaceEX {

    public static void main(String[] args) {

        Original o = new Original();

        o.show();
        o.inter();
        o.config();

    }

}
