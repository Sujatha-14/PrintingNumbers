package Looping;
import java.util.Scanner;
public class muntilple3and5 {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=src.nextInt();
		int no=1;
		while(no<=a)
		{
			if(no%3==0&&no%5==0)
		{
				System.out.println(no+" ");
		}
			no++;
		}
		
	}

}
