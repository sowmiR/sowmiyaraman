package bbb;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]){
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the alphabet");
		ch=scan.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+"is alphabet");
			
		}
		else
		{
			System.out.println(ch+"is not an alphabet");
		}
		
	}
	

}
