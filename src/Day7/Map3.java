package Day7;

import java.util.HashMap;

public class Map3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("UST", 15);
        map.put("TVM", 20);
        map.put("Kochi", 10);

        System.out.println("First map"+map);
        
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Alappy", 25);
        map1.put("banglore", 8);
        System.out.println("Second map" +map1);
        
        map1.putAll(map);
        System.out.println("copied map" +map1);
        
        
        
        
	}
	

}
