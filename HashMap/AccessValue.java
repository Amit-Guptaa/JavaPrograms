// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class AccessValue {
    public static String getCapitals(HashMap <String,String>capitals,String country){
        String capital =capitals.get(country);
        if(capital==null){
            return "Not Found!";
        }

        return capital;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hashMapString= sc.nextLine();
        String country = sc.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, String>>(){}.getType();
        HashMap<String, String> countryCapitals = new Gson().fromJson(hashMapString, mapType);

        String result = getCapitals(countryCapitals, country);
        System.out.println(result);

        sc.close();
    }
}
