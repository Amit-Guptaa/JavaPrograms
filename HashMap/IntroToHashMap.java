import java.util.HashMap;

public class IntroToHashMap{
    public static HashMap<String,String>createStringStrinMap(){
        HashMap<String,String>map= new HashMap<>();
        map.put("Apple","red");
        map.put("banana","Yellow");
        map.put("guava","Green");
        return map;
    }

public static void main (String []args ){
    HashMap<String , String > map = createStringStrinMap();
    // print the hashmap
    for(String key: map.keySet()){
        System.out.println(key + ":" +map.get(key));
    }
}
}