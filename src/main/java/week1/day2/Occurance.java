package week1.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurance {

	public static void main(String[] args) {
		
		String data = "Welcome to Automation";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : data.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
                map.put(c, 1);
			}
		}
		for (Entry<Character, Integer> key : map.entrySet()) {
			System.out.println(key.getKey()+" : "+key.getValue());
		}

	}

}
