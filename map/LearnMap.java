package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		//koushik,gayatri,babu,sarath,gopi
		
		//Map<key,Value> map = new Map<key,Value>();
        
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "koushik");
		map.put(2, "gayatri");
		map.put(3, "babu");
		map.put(4, "sarath");
		map.put(5, "gopi");
		System.out.println(map.size());
		System.out.println(map.get(3));
		//for(datatype obj : col)
		
		/*for(Entry<Integer, String> eachEntry: map.entrySet()) {
			System.out.println(eachEntry.getValue()+" "+eachEntry.getKey());
		}*/
		
		map.remove(5);
		System.out.println(map.containsKey(5));
		map.clear();
		System.out.println(map.isEmpty());
		
		
		
		
	}
	
}
