package eHealth;

import static java.lang.System.*;

public class CHARACTERS_IN_STRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="lordmallam", s2 = "nugwanoma";
			out.println(orderNbyN(s1,s2));
			out.println(orderN(s1,s2));
	}

	static String find_chars(String string1, String string2){
		String result = "";
		for(int i=0;i<string1.length();i++){
			for(int j=0;j<string2.length();j++){
				if(string1.charAt(i) == string2.charAt(j)){
					result += string1.charAt(i);
				}
			}
		}
		return result;
	}
	
	static String orderNbyN(String s1, String s2){
		return find_chars(s1,s2);
	}
	
	static String orderN(String s1, String s2){
		String rValue = find_chars(s1,s2);
		String result = "";
		for(int i=0;i<rValue.length();i++){
			if(!result.contains(String.valueOf(rValue.charAt(i)))){
				result += rValue.charAt(i);
			}
		}
		return result;
	}
}
