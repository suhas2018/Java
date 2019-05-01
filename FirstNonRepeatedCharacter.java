/**
 * @author Suhas KM
 * 
 * Program to find first non repeated characters in a given word
 *
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		getFirstNonRepeatCharacter("hello");
		getFirstNonRepeatCharacter("Java");

	}

	private static void getFirstNonRepeatCharacter(String str) {
		Map<Character, Integer> count = new LinkedHashMap<>(str.length());
		
		for(char c : str.toCharArray()) {
			count.put(c, count.containsKey(c) ? count.get(c)+1 : 1 );
		}
		
		System.out.println("First Non Repeated character in string :: "+ str);
		for(Entry<Character,Integer> entry : count.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
