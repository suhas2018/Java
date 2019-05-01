/**
 * @author Suhas KM
 * 
 * Program to find if a given word contains duplicate character
 *
 */

import java.util.HashMap;
import java.util.Map;


public class CheckUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(isUniqueChars2("building"));

	}

	public static boolean isUniqueChars2(String str) {
		Map<Character, Character> m = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(m.containsKey(c)) return false;
			else {
				m.put(c, c);
			}
		}
		return true;
	}

}
