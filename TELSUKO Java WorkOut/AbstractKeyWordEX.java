abstract class Car {

    public abstract void drive();

    public void playMusic() {

        System.out.println("Playing Music");
    }
}

class WagonR extends Car {

    public void drive() {

        System.out.println("Driving");
    }
}

public class AbstractKeyWordEX {

    public static void main(String[] args) {

        Car c1 = new WagonR(); // cannot create object for abstract class

        c1.drive();
        c1.playMusic();

    }

}
