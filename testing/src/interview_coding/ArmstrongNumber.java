package interview_coding;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer number");
		int num=sc.nextInt();
		isArmstrong(num); //153=1+125+27
		sc.close();
	}
	public static void isArmstrong(int num) {
		int dup=num, res=0, rem;
		while(num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num/=10;
		}
		if(res==dup)
			System.out.println("armstrong number.");
		else
			System.out.println("not an armstrong number.");
	}
}
