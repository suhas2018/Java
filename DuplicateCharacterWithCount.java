/**
 * @author Suhas KM
 * 
 * Program to find count of duplicate characters in a given word
 *
 */

import java.util.HashMap;
import java.util.Map;


public class DuplicateCharacterWithCount {

	public static void main(String[] args) {
		String str = "Better Buttier";
		duplicateCharacterWithTheirCount(str);
		duplicateCharacterWithTheirCount("Programming");
		duplicateCharacterWithTheirCount("Combination");
		duplicateCharacterWithTheirCount("Java");
	}

	private static void duplicateCharacterWithTheirCount(String str) {
		Map<Character, Integer> m = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if(m.containsKey(key)) {
				Integer cnt = m.get(key)+1;
				m.put(key, cnt);
			}else {
				m.put(key, 1);
			}
		}
		
		System.out.println("List of Duplicate characters with there count for input :: "+str);
		System.out.println("**********************************************************");
		for(Character s : m.keySet())
		{
			if(s != ' ') {
				System.out.println("Character : "+s+" -- Count : "+m.get(s));
			}
		}
		
	}

}
