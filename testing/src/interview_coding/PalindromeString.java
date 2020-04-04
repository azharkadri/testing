package interview_coding;

public class PalindromeString {
	public static void isPalindrome(String str) {
		
		char[] c=new char[str.length()];
		for(int i=0,j=str.length()-1; i<str.length(); i++,j--) {
			c[i]=str.charAt(j);
			
		}
		String revStr=new String(c);
		if(revStr.equals(str))
			System.out.println("yes, palindrome: "+revStr);		
		else
			System.out.println("no, not a palindrome string: "+revStr);
			
		
	}

	public static void main(String[] args) {
		String str="madam";
		String str2="azhar";
		isPalindrome(str);
		isPalindrome(str2);
	}
}
