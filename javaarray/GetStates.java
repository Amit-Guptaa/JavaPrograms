
public class GetStates {
    public static String getClassStats(int[] grades) {
        // Write your code here
        double sum=0;
        int highestGrade=grades[0];
        int lowestGrade=grades[0];
        int passingGrade=0;
        for(int num: grades){
            sum+=num;
            if(num>highestGrade){
                highestGrade=num;
            }
            if(num<lowestGrade){
                lowestGrade=num;
            }
            if(num>=60){
                passingGrade++;
            }
        }
         double classAverage;
        classAverage=sum/grades.length;
       return "Class Average: "+classAverage+
              "\nHighest Grade: "+highestGrade+
              "\nLowest Grade: "+lowestGrade+
              "\nPassing Grades: "+passingGrade+"/"+grades.length;
    }
    
    public static String getLetterGrades(int[] grades) {
        // Write your code here
          int aCount=0;
          int bCount=0;
          int cCount=0;
          int dCount=0;
          //int eCount=0;
          int fCount=0;
          for(int num2: grades){
            if(num2>=90){
                aCount++;
            }
            else if(num2>=80){
                bCount++;
            }
            else if(num2>=70){
                cCount++;
            }
            else if(num2>=60){
                dCount++;
            }
            else{
                fCount++;
            }
          }
          return "A (90-100): "+aCount+
                 "\nB (80-89): "+bCount+
                 "\nC (70-79): "+cCount+  
                 "\nD (60-69): "+dCount+ 
                 "\nF (0-59): "+fCount ;    
    }
    
    public static String getImprovement(int[] start, int[] end) {
        // Write your code here
          double totalImprovement=0;
          int mostImproved=0;
          int improved=0;
          for(int i=0;i<start.length;i++){
            int diff;
            diff= end[i]-start[i];
            totalImprovement+=diff;
            if(diff>mostImproved){
                mostImproved=diff;
            }
            if(diff>0){
                improved++;
            }
          }
          double avgImprovement;
          avgImprovement=totalImprovement/start.length;
          return "Average Improvement: "+avgImprovement+" points"+
          "\nMost Improved: "+mostImproved+" points"+
          "\nStudents Improved: "+improved+"/"+start.length;
    }
    
    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        
        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        
        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        
        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}