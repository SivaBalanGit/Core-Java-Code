class Student {

    int rollNo;
    String name;
    int totalMark;
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Siva";
        s1.totalMark = 545;

        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Hari";
        s2.totalMark = 341;

        Student s3 = new Student();
        s3.rollNo = 103;
        s3.name = "Ganesh";
        s3.totalMark = 498;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i].rollNo + " " + students[i].name + " " + students[i].totalMark);

        }

    }

}
