class Human {

    private int age;
    private String name;

    public int getAgeValue() {

        return age;

    }

    public void setAgeValue(int age) {

        this.age = age;

    }

    public String getNameValue() {

        return name;
    }

    public void setNameValue(String name) {

        this.name = name;
    }

}

public class EncapsulationEX {

    public static void main(String[] args) {

        Human obj = new Human();

        obj.setAgeValue(21);
        obj.setNameValue("Siva");

        System.out.println(obj.getAgeValue() + " : " + obj.getNameValue());

    }

}
