
public class ifElse {
    public static void main(String[] args) {
        int month=6;
        String season;
        if(month==11||month==12||month==1||month==2)
            season = "winter";
        else if( month==3||month==4)
            season = "spring"; 
        
        else if ( month==5||month==6||month==7)
                season = "summer";
        
                else 
                    season = "unknown";     
            
        System.out.println("june is a month of " +season);
        
    }
}
