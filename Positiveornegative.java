package vv;

import java.util.Scanner;

public class Positiveornegative {
	public static void main(String args[]){
		int num;
		Scanner scan=new Scanner(System .in);
		System.out.println("enter the number");
		num=scan.nextInt();
		if(num>0)
		{
			System.out.println(num+"is positive number.");
		}
		else if(num<0)
		{
			System.out.println(num+"is negative number.");
			
		}
		else
		{
			System.out.println(num+"is zero.");
		}
	}

}
