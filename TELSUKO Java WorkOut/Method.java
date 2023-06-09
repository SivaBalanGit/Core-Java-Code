class user {

    public void playMusic() {

        System.out.println("Music is Playing.....");

    }

    public String getMeAPen(int cost) {

        // System.out.println(cost);
        if (cost >= 10)
            return "Pen";
        return "Please Pay 10RS";

    }
}

class Method {

    public static void main(String[] args) {

        user obj = new user();

        obj.playMusic();
        System.out.println(obj.getMeAPen(8));
    }
}