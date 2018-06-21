
public class decodeString {

	public decodeString() {
		// TODO Auto-generated constructor stub
	}

	public static String decode_string(String s) {
		String result="";
		if(s.indexOf('[') ==-1) {
			return s;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i)) && s.indexOf('[')!=-1) {
				String s1 = decode_string(s.substring(i+1,s.lastIndexOf(']')));
				for(int j =0; j<Integer.parseInt(""+s.charAt(i)); j++){
					result+=s1;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "4[ab]";
		System.out.println(decode_string(s));
	}
}
