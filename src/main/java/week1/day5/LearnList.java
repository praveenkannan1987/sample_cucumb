package week1.day5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>(); 
		ls.add("koushik");
        ls.add("gayatri");
        ls.add("koushik"); 
        ls.add("sarath"); 
        ls.add("gayatri");
       System.out.println("List size: "+ls.size());
        Set<String> set = new LinkedHashSet<>();
        set.addAll(ls);
        System.out.println("Set size: "+set.size());

        for (String setValues : set) {
			System.out.println(setValues);
		}
        // To remove a element
       // ls.remove(0);
        // To check if the element is present in the list
//        System.out.println(ls.contains("koushik"));
        // To remove all the elements from a list (similar to delete)
       // ls.clear();
        // To check whether list is empty or not
       // System.out.println(ls.isEmpty());
        // To get a particular value
        /*System.out.println(ls.get(2));
         *  To print the size
        System.out.println(ls.size());
        System.out.println(ls);
        ls.remove("Gayatri");
        System.out.println(ls.size());
        System.out.println(ls);*/
        /*for (String name : ls) {
			System.out.println(name);
		}*/
	}

}
