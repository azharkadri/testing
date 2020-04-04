package interview_coding;

public class StringWordOcurrence {
	
	static int countOccurences(String str, String word) { 
		String a[] = str.split(" "); 
		int count = 0; 
		for (int i = 0; i < a.length; i++) { 
			if (word.equals(a[i])) 
				count++; 
		} 
	return count; 
    } 

	public static void main(String args[]) { 
	String str = "GeeksforGeeks A computer science portal portal portal portal for geeks "; 
	String word = "portal"; 
	System.out.println(countOccurences(str, word)); 
    } 
}
