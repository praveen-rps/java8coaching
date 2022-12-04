package javabasics;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		
		if(a<b) {
			System.out.println("Inside the first true block");
		}
		
		System.out.println("Outside the block...");
		
		
		if(a<b) {
			System.out.println("Inside the second true block");
		}
		else
		{
			System.out.println("Inside the false block");
		}
		System.out.println("After if else block..");
	}

}
