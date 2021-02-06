package BasicsOfJava;

import java.util.Scanner;

public class ReportCard {
static	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReportCard rc = new ReportCard();
				int num=0;
				System.out.println(num);
				System.out.println("please enter the number of subjects = ");
				num = in.nextInt();
			int[]marks = new int[num];
				System.out.println("please enter the marks");
				rc.SetMarks(marks, num);
				rc.GetAverage(num, marks);
		
		
		
	}
	//Generic Methods so that i can use this API for any class i.e 10th , 11th , Enggineering etc

	static void SetMarks(int[] marks,int num)
	{
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Marks in Subject "+(i+1)+" :");
			marks[i]=in.nextInt();
		}
		
	}
	
	static void GetAverage(int num,int[] marks)
	{
		int total =0;
		float avg =0;
		for(int i=0;i<marks.length;i++)
		{
			total = total+marks[i];
			
			//System.out.println(marks[i]);
			//avg = total/number of subjects
			
		}
		avg = (float)total/num;
		System.out.println("Total = " +total);
		System.out.println("Average = " +avg);
	}
}
