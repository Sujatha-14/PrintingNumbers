package Looping;
import java.util.Scanner;
public class Printone {

	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=src.nextInt();
	int i=1;
	while(i<=a){
		System.out.print(1+" ");
		i++;
	}
	}
}
