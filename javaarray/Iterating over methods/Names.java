import java.util.*;

public class Names {
    public static void name(String[] names){
        for(String naming: names){
            System.out.println(naming);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students are going to be participated:");
        int n=sc.nextInt();
         sc.nextLine();
        System.out.println("Please enter their names:");
        String[] nameOfParticipants= new String[n];
        for(int i=0;i<nameOfParticipants.length;i++){
            nameOfParticipants[i]=sc.nextLine();
        }
       
        System.out.println("finalized list of participants");
        name(nameOfParticipants);
        sc.close();
    }
    
}
