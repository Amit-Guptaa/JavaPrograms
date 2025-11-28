//import java.util.Scanner;
class CallStudent{
    String name;
    int age;
    String gender;
    CallStudent(String n,int a,String g){
        name=n;
        age=a;
        gender=g;
    }
    void setData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }

}
public class NewStudent {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        CallStudent s1 = new CallStudent(null, 0, null);
        CallStudent s2 = new CallStudent(null, 0, null);
        s1.name="amit";
        s2.name="sakshi";
        s1.age=18;
        s2.age=16;
        s1.gender="male";
        s2.gender="female";
        System.out.println("Student S1 has submitted the following details:");
        s1.setData();
        System.out.println("Student S2 has submitted the following details:");
        s2.setData();

            //sc.close();
    }
    
}
