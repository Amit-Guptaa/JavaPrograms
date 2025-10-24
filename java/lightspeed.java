public class lightspeed {
    public static void main(String[] args) {
        //to calculate distance travelled by light in a specific days//
        int speedoflight;
        long days;
        long seconds;
        long distance;
        // spped of light in miles per second is approximately //

        speedoflight = 186000;
         days=1000;
         seconds = days*24*60*60;
          distance= speedoflight*seconds;
          System.out.print("In "+days);
          System.out.print(" days light travels distance of ");
          System.out.println( distance + " miles");

        

    }
}
