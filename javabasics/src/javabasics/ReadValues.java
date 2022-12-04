package javabasics;
import java.util.Scanner;
public class ReadValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the scanner class object
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter a value");
		a= sc.nextInt();
		System.out.println("Enter b value");
		b= sc.nextInt();
		c=a+b;
		System.out.println("The sum is : "+c);

	}

}
