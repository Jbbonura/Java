import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Hello", "Hello my baby, hello my darlin");
        trackList.put("Goodbye", "Goodbye for now");
        trackList.put("Alone", "So lonely, I have nobody");
        trackList.put("Village", "It takes a whole village");

        String name = trackList.get("Alone");
        System.out.println(name);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " " + trackList.get(key));
        }
    }
}