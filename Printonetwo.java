package Looping;
import java.util.Scanner;
public class Printonetwo {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=src.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			System.out.print(i+" ");
		}
		

	}

}
