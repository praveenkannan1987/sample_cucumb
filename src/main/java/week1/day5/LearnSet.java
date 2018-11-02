package week1.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("koushik"); 
        set.add("gayatri");
        set.add("koushik"); 
        set.add("sarath"); 
        set.add("gayatri");
        set.add("gopi");
        set.add("Babu");
        set.add("babu");
        List<String> ls = new ArrayList<>();
        ls.addAll(set);
        System.out.println(ls.get(0));
        for (String setName : set) {
        	ls.add(setName);
			System.out.println(setName);
		}
	}

	
	
	
	
	
	
}
