class Student {
    int rollNo;
    int mark;

    Student(int rollNo, int mark) {
        this.rollNo = rollNo;
        this.mark = mark;
    }
}

public class constructor {
    public static void main(String[] args) {

        Student s1 = new Student(102, 90);
        Student s2 = new Student(103, 78);
        Student s3 = new Student(104, 82);

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