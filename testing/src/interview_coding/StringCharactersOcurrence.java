package interview_coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharactersOcurrence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string.");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		System.out.println("********************************");
		for(Map.Entry<Character, Integer> m: hm.entrySet())
			System.out.println(m.getKey()+"   : "+m.getValue());
		
		sc.close();
	}
}
