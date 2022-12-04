package javabasics;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value");
		int x = sc.nextInt();
		System.out.println("Enter the second value");
		int y= sc.nextInt();
		
		if(x==y) {
			System.out.println("Both are equal");
		}
		else if(x < y)
			System.out.println("the bigger is "+y);
		else
			System.out.println("The bigger is : "+x);

	}

}
