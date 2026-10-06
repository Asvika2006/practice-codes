class Student {
    int rollNo;
    int mark;
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollNo = 101;
        s1.mark = 85;

        s2.rollNo = 102;
        s2.mark = 90;

        s3.rollNo = 103;
        s3.mark = 78;

        System.out.println("Student 1");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Mark: " + s1.mark);

        System.out.println("Student 2");
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Mark: " + s2.mark);

        System.out.println("Student 3");
        System.out.println("Roll No: " + s3.rollNo);
        System.out.println("Mark: " + s3.mark);
    }
}