enum Status {

    Running, Failed, Pending, Success;
}

public class EnumEX {

    public static void main(String[] args) {

        // int i = 5;

        // Status[] ss = Status.values();

        // for (Status s : ss) {

        // System.out.println(s + " : " + s.ordinal());
        // }

        Status s = Status.Running;

        switch (s) {

            case Running:
                System.out.println("All Done");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

    }

}
