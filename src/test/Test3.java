package test;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Test3 {
	public static void main(String[] args) {

		String str = "asdfasd";
		//String str = "qmmwertyuiop";
		//String str = "qwertyuiopasdfghjklzxcvbnmm";
		Test3 o = new Test3();
		System.out.println("Map -------------------------");
		char ch = o.repSol(str);
		System.out.println("Repeating charcter = " + ch);
		System.out.println("Logic -------------------------");
		ch = o.nonRep(str);
		System.out.println("Repeating charcter = " + ch);
	}

	public char nonRepMapSol(String str) {
		int i = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (int z = 0; z < charArray.length; z++) {
			i++;
			if (hm.get(charArray[z]) != null) {
				hm.put(charArray[z], (hm.get(charArray[z])) + 1);
			} else
				hm.put(charArray[z], 1);
		}
		System.out.println("HASH MAP ::: " + hm);
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			i++;
			if (e.getValue() == 1) {
				System.out.println("ITERATIONS ::: " + i);
				return e.getKey();
			}
		}
		System.out.println("ITERATIONS ::: " + i);
		return 'z';
	}

	public char repMapSol(String str) {
		int i = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (int z = 0; z < charArray.length; z++) {
			i++;
			if (hm.get(charArray[z]) != null) {
				System.out.println("ITERATIONS ::: " + i);
				return charArray[z];
				// hm.put(charArray[z], (hm.get(charArray[z])) + 1);
			} else
				hm.put(charArray[z], 1);
		}
		System.out.println("HASH MAP ::: " + hm);
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			i++;
			if (e.getValue() == 1) {
				System.out.println("ITERATIONS ::: " + i);
				return e.getKey();
			}
		}
		System.out.println("ITERATIONS ::: " + i);
		return 'z';
	}

	public char nonRep(String str) {
		int i = 0;
		char[] charArray = str.toCharArray();
		for (int z = 0; z < charArray.length; z++) {
			for (int y = z + 1; y < charArray.length; y++) {
				i++;
				if (charArray[z] == charArray[y]) {
					System.out.println("ITERATIONS ::: " + i);
					return charArray[z];
				}
			}
		}
		System.out.println("ITERATIONS ::: " + i);
		return 'z';
	}

	public char repSol(String str) {
		for (int i = 0; i < str.length(); i++) {
			int x = str.indexOf(str.charAt(i));
			int y = str.lastIndexOf(str.charAt(i));
			System.out.println("x & y --->>> " + x + "\t" + y);
			if (x == y) {
				return str.charAt(i);
			}
		}
		return 'z';
	}
}
