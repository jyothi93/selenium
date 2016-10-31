package hello;

import java.util.Scanner;

public class calculator {

	public static void main(String args[]) {
	Scanner joe=new Scanner(System.in);
	double fnum,snum,answer;
	System.out.println("Enter first num: ");
	fnum=joe.nextDouble();
	System.out.println("Enter second num: ");
	snum=joe.nextDouble();
	answer=fnum+snum;
	System.out.println(answer);
	
}
}