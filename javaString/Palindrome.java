public class Palindrome {
    public static void main(String[] args) {
        String str="oppo";
        String reveString="";
        for(int i=str.length()-1;i>=0;i--){
         reveString=reveString+str.charAt(i);

        }
        if(str.equals(reveString)){
            System.out.println(str+ " is a palindrome!");
        }
        else{
            System.out.println(str+ " is not palindrome!");
        }
    }
}
