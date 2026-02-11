package workWithStrings;

public class StrRevPreserveWhiteSpace {
	
	public static String reversePreserveWhitespace(String str) {
        if (str == null) return null;
        
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length-1;
        
        while(left < right) {
        	
        	// Skip whitespace from left
        	while(left < right && Character.isWhitespace(arr[left])) {
        		left++;
        	}
        	
        	// Skip whitespace from right
        	while(left < right && Character.isWhitespace(arr[right])) {
        		right--;
        	}
        	
        	// Skip non-whitespace chars
        	if(left < right) {
        		char temp = arr[left];
        		arr[left] = arr[right];
        		arr[right] = temp;
        		left++;
        		right--;
        	}
        }
        
        return new String(arr);
    }
    
    public static void main(String[] args) {
        String input = "tseTted Snar  amuK";
        System.out.println(reversePreserveWhitespace(input));
    }
}
