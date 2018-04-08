
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int n=0;
			for(String x:hashmap1.keySet()) {
				for(String b:hashmap2.keySet()) {
					if(x==b) {
						if(hashmap1.get(x).equals(hashmap2.get(b))) {
							n++;
						}
					}
				}
				
			}
			
		return n;
	}

}
