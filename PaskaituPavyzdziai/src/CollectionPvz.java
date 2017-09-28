import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionPvz {

	public static void main(String[] args) {


		Map <Integer, String> m = new HashMap<Integer, String>();
		
		m.put(5, "tekstas");
		m.put(9, "");
		
		m.put(99, "kazkoks test tekstas");
		
	
		
	/*	for(String s : m.values()){
			System.out.println(s);
		}
		
		for(Integer i : m.keySet()){
			System.out.println(i + "->" + m.get(i));
		}
		
		for(Map.Entry<Integer, String> e : m.entrySet()){
			System.out.println(e.getKey() + "->" + e.getValue());
		}*/
		
		Object [] array1 = m.entrySet().toArray();
		
		
		
		
		//Map.Entry<Integer, String> [] mas =(Map.Entry<Integer, String> []) m.entrySet().toArray();
		
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i].getClass());
		}
		
		
		
		
		

		
		

		

	}

}
