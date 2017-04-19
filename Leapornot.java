package kk;

import java.util.Scanner;

public class Leapornot {

	public static void main(String args[]){
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		year=scan.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0)){
			System.out.println(year+"is a leap year");
			
		}
		else
		{
			System.out.println(year+"is not a leap year");
		}
		
	}

}
