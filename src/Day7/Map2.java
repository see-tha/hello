package Day7;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("UST", 15);
        map.put("TVM", 20);
        map.put("Kochi", 10);

        System.out.println(map);
        System.out.println(map.size());
	}

}
