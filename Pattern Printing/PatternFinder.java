import java.util.Scanner;

public class PatternFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arrString1= sc.nextLine();
        String arrString2= sc.nextLine();
        String [] str1 = arrString1.split(",");
        String [] str2 = arrString2.split(",");
        boolean patternFound = false;
        if(str2.length>str1.length){
            System.out.println(false);
            return;
        }
        for(int i=0;i<str1.length-str2.length;i++){
            boolean matchFound= true;
            for(int j=0;j<str2.length;j++){
                if(!str1[i+j].equals(str2[j])){
                    matchFound=false;
                    break;
                }
            }
            if(matchFound){
                patternFound=true;
                break;
            }

        }
        System.out.println(patternFound);
        sc.close();
    }
}
