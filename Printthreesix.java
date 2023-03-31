package Looping;
import java.util.Scanner;
public class Printthreesix {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=src.nextInt();
		int no=3,count;
		for(int i=1;i<=a;i++)
		{
			count=no*i;
			System.out.println(count+" ");
		}

	}

}
