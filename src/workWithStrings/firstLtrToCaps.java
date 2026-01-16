package workWithStrings;

public class firstLtrToCaps {

	public static void main(String[] args) {

		String str = "Kumaran will become rich";
		String words[] = str.split("\\s+");

		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}

		System.out.println(sb);

	}

}
