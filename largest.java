package ttt;

import java.util.Scanner;

public class largest {
public static void main(String args[]){
	int a,b,c,largest;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the three numbers");
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	if(a>=b&&a>=c)
	{
		System.out.println(" a is largest number");
		
	}
	 if(b>=a&&b>=c)
	{
		System.out.println(" b is largest number");
		
	}
	if(c>=a&&c>=b)
	{
		System.out.println("c is largest number");
	}
		
	
}
}
