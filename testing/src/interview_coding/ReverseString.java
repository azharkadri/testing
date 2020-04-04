package interview_coding;

public class ReverseString {

	public static void main(String[] args) {
		String str="azhar kadri";
		char[] revString=reverseString(str);
		System.out.println("without reverse: "+str);
		for(int i=0;i<revString.length;i++) {
			System.out.print(revString[i]);
		}
		
	}
	public static char[] reverseString(String str) {
		
//		char[] c=str.toCharArray();
//		char[] revChar=new char[c.length];
//		for(int i=0,j=c.length-1;i<c.length;i++,j--) {
//			revChar[i]=c[j];
//		}
		
		
		
		char[] revChar=new char[str.length()];
		for(int i=0,j=str.length()-1;i<str.length();i++,j--) {
			revChar[i]=str.charAt(j);
		}
		return revChar;
	}
}
