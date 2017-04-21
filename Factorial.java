import java.util.Scanner;


public class Factorial {
	public static void main(String args[]){
		int i,number,fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		number=scan.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of +number is:" +fact);
	}
}
