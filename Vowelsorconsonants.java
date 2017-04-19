package hhh;

import java.util.Scanner;

public class Vowelsorconsonants {
	public static void main(String args[]){
	char ch;
	Scanner scan=new Scanner(System.in);
	System .out.println("enter the character");
	ch=scan.next().charAt(0);
	if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
	{
		System.out.println(ch+"is a vowel.");
		
		}
	else
	{
		System.out.println(ch+"is a consonants.");
	}
	}

}
