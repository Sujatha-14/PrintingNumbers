package Looping;
import java.util.Scanner;
public class Multiple3or5 {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the value:");
	int a=src.nextInt();
	int i=1;
	while(i<=a) {
		if(i%3==0||i%5==0)
		{
			System.out.println(i+" ");
		}
		i++;
		
	}
	}

}
