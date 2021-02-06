package BasicsOfJava;

import java.util.Scanner;

public class Calculator {
	
	Calculator()
	{
		System.out.println("This is a constructor");
	
	}
	
	Calculator(int x , int y)
	{
		int sum = x+y;
		System.out.println("Sum is " +sum);
	}

	static Scanner in = new Scanner(System.in);
	static int[]rollNum ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator(10,15);
		
	
	
	int[] result=cal.TestRollNumber(rollNum); 
	
	for(int i=0;i<result.length;i++)
	{
		System.out.println("Roll number is " +result[i]);
	}
		

	}

	static int Sum(int x,int y) {
		return x+y;
	}
	
	static int[] TestRollNumber(int[]rollNum)
	{
		rollNum = new int[6];
		System.out.println("Enter the roll number");
		for(int i=0;i<rollNum.length;i++)
		{
			rollNum[i]=in.nextInt();
		}
		
	return rollNum;
	}
}
