package javabasics;

import java.util.Scanner;

public class Biggest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value");
		int x = sc.nextInt();
		System.out.println("Enter the second value");
		int y= sc.nextInt();
		System.out.println("Enter the third value");
		int z= sc.nextInt();
		
		if( x < y) {
			if(y < z) {
				System.out.println("The bigger is : "+z);
			}
			else
			{
				System.out.println("The bigger is : "+y);
			}
		}
		else
		{
			if(x < z) {
				System.out.println("The bigger is : "+z);
			}
			else
			{
				System.out.println("The bigger is : "+x);
			}
		}
		

	}

}
