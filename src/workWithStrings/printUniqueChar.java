package workWithStrings;

import java.util.HashMap;
import java.util.Map;

public class printUniqueChar {

	public static void main(String args[]) {
		String str = "HarishKumar";
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (char ch : str.toCharArray()) {
			if (map.get(ch) == 1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
