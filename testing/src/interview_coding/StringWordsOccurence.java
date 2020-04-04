package interview_coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringWordsOccurence {
	public static void stringWordsOccurence(String str) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String[] ss=str.split(" ");
		for(String s : ss) {
			if(hm.containsKey(s))
			hm.put(s, hm.get(s)+1);
			else
			hm.put(s, 1); 
		}
		for(Map.Entry<String, Integer> me : hm.entrySet())
		System.out.println(me.getKey()+"  :  "+me.getValue());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any sentence");
		String str=sc.nextLine();
		//System.out.println("sentence :"+str);
		stringWordsOccurence(str);	
		sc.close();
	}
}
