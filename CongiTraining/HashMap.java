import java.util.ArrayList;
import java.util.Map;



public class HashMap {

	public static void main(String[] args) {
		// Create a HashMap
        Map<String, String> hashMap = (Map<String, String>) new HashMap();
        ArrayList

        // Add key-value pairs to the HashMap
        hashMap.put("name", "test");
        hashMap.put("address", "pune");

        // Generate formatted output
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("\"" + key + "\"=\"" + value + "\"");
        }

	}

}
