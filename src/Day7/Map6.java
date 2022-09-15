package Day7;

import java.util.HashMap;

public class Map6 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("UST", 15);
        map.put("TVM", 20);
        map.put("Kochi", 10);

        System.out.println("Orginal map:"+map);
        
        HashMap<String, Integer> map2 = new HashMap<>();
        map2 = (HashMap)map.clone();
        System.out.println("Shallow copy of map" +map2);
	}


}
