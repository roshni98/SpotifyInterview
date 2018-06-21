
public class sortByStrings {

	public sortByStrings() {
		// TODO Auto-generated constructor stub
	}
	
	public static String sort_by_strings(String s,String t) {
		//depend on ordering of t 
		// s is the string which will be manipulated
		//Assuming all letters of s will be in t
		char [] arr = new char[26]; //count occurrences
		char[] result = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			arr[c-'a']+=1;
		}
		int idx = 0;
		for(int j=0; j<t.length(); j++) {
			for(int k=0; k< arr[t.charAt(j)-'a']; k++) {
				result[idx++] = t.charAt(j); 
			}
		}
		String sorted = new String(result);
		return sorted;
	}

	public static void main(String[] args) {
		System.out.println(sort_by_strings("good","odg"));

	}
}
