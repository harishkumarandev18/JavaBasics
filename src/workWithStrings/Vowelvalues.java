package workWithStrings;

import java.util.HashMap;
import java.util.Map;

public class Vowelvalues {

	public static void main(String[] args) {
		
		String str = "Kumaran gonna be successful";
		String uprStr = str.toUpperCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < uprStr.length(); i++) {
			char ch = uprStr.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				if (map.containsKey(ch)) {
					int count = map.get(ch);
					map.put(ch, count + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		
		// Method 1 for printing
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +":"+ entry.getValue());
		}
		
		// Method 2 for printing
		map.forEach((key, value) -> System.out.println(key +":"+ value));
	}

}
