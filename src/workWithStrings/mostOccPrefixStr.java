package workWithStrings;

import java.util.HashMap;
import java.util.Map;

public class mostOccPrefixStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"app","apple","application","appeal","banana"};
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			for(int i=1; i<=word.length(); i++) {
				String prefix = word.substring(0, i);
				map.put(prefix, map.getOrDefault(prefix, 0) + 1);
			}
		}
		
		String mostOccPre = "";
		int maxCount = 0;
		
		for(Map.Entry<String, Integer> map2 : map.entrySet()) {
			if(map2.getValue() > maxCount) {
				maxCount = map2.getValue();
				mostOccPre = map2.getKey();
			}
		}
		
		System.out.println(mostOccPre);
		System.out.println(maxCount);
	}
}
