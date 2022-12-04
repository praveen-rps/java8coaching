package javabasics;
import java.util.Scanner;





public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value");
		int x = sc.nextInt();
		System.out.println("Enter the second value");
		int y= sc.nextInt();
		
		if(x < y)
			System.out.println("The bigger is  :"+y);
		else
			System.out.println("The bigger is : "+x);

	}

}
