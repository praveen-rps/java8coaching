package javabasics;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length, breadth, area;
		String name= sc.nextLine();
		System.out.println(name+" Welcome to java");
		System.out.println("Enter the length");
		length=sc.nextInt();
		System.out.println("Enter the breadth");
		breadth=sc.nextInt();
		area=length*breadth;
		System.out.println("The area of rectangle is : "+area);
		double d = sc.nextDouble();
		sc.nextByte();
		sc.nextBoolean();
	}

}
