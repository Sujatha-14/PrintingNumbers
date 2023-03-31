package Looping;
import  java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the value:");
	int a=src.nextInt();
	short  no=2;
	 boolean bool=true;
	while(no<=a)
	{
		if(no%2==0) {
			System.out.println("not prime"+no);
			bool=false;
		}
		if(bool) {
			System.out.println("This is prime"+no);	
		}
		no++;
	}

	}

}
