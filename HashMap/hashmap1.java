import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
    public static void main(String[] args) {

        HashMap<String, String> states = new HashMap<String, String>();

        // put() Method
        //states.put(key, value) --> syntax

        states.put("Ts", "Telangana");
        states.put("Ka", "Karnataka");
        states.put("Ap", "Andhra Pradesh");
        states.put("Tn", "Tamil Nadu");
        states.put("Kr", "Kerala");

        System.out.println(states);

        //op : {Ka=Karnataka, Kr=Kerala, Tn=Tamil Nadu, Ts=Telangana, Ap=Andhra Pradesh}

        for (Map.Entry<String, String> e : states.entrySet()) {
            System.out.println(e.getKey()+"--->"+e.getValue());
        }

        // op: {Ka=Karnataka, Kr=Kerala, Tn=Tamil Nadu, Ts=Telangana, Ap=Andhra Pradesh}
        // Ka--->Karnataka
        // Kr--->Kerala
        // Tn--->Tamil Nadu
        // Ts--->Telangana
        // Ap--->Andhra Pradesh
    }
}
