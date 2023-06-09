
class Laptop {

    String model;
    int price;

    public String toString() {

        return model + " : " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class ToStringandHashcode {

    public static void main(String[] args) {

        Laptop lp = new Laptop();
        lp.model = "Macbook Pro";
        lp.price = 200000;

        Laptop lp2 = new Laptop();
        lp2.model = "LENOVO ZZZ";
        lp2.price = 150000;

        System.out.println(lp);
        System.out.println(lp2);

    }

}
