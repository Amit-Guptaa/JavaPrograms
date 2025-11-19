import java.util.Scanner;

class Student {
    int rollNo;
    float percent;
    static String collegeName;

    void setRollNo(int rn) {
        rollNo = rn;
    }

    void setPercent(float pr) {
        percent = pr;
    }

    static void setCollegeName(String name) {
        collegeName = name;
    }

    int getRollNo() {
        return rollNo;
    }

    float getPercent() {
        return percent;
    }

    String getCollegename() {
        return collegeName;
    }
}

public class testStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setRollNo(sc.nextInt());
        s2.setRollNo(sc.nextInt());
        s3.setRollNo(sc.nextInt());
        s1.setPercent(sc.nextFloat());
        s2.setPercent(sc.nextFloat());
        s3.setPercent(sc.nextFloat());
        sc.nextLine();
        Student.setCollegeName(sc.nextLine());
        System.out.println("Details for student s1");
        System.out.println("rollNo:" + s1.getRollNo());
        System.out.println("percent:" + s1.getPercent());
        System.out.println("collegeName:" + s1.getCollegename());
        System.out.println("Details for student s2");
        System.out.println("rollNo:" + s2.getRollNo());
        System.out.println("percent:" + s2.getPercent());
        System.out.println("collegeName:" + s2.getCollegename());

        System.out.println("Details for student s3");
        System.out.println("rollNo:" + s3.getRollNo());
        System.out.println("percent:" + s3.getPercent());
        System.out.println("collegeName:" + s3.getCollegename());

        sc.close();
    }

}
