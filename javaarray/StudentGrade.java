import java.util.Scanner;

public class StudentGrade {
    public static double gradeAvg(int [] array){
        int sum=0;
        for(int grade: array){
            sum+=grade;
        }
        System.out.println("sum: "+sum);
        double avg;
        avg = sum/array.length;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] stringArr1 = text.split(",");
        int[] StudentGrade = new int[stringArr1.length];
        for (int i = 0; i < StudentGrade.length; i++) {

            StudentGrade[i] = Integer.parseInt(stringArr1[i]);
        }
        double result =gradeAvg(StudentGrade);
        System.out.println("the average grade of this student is : "+result);

        sc.close();
    }
}
