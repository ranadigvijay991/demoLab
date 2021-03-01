package com.r177219076.q5;
import java.util.Scanner;
public class Ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[10];
		for(int i=0; i<10;i++)
		{
			System.out.println("Enter marks for student "+(i+1)+" : ");
			marks[i] = sc.nextInt();
		}
		System.out.println("Student Number\tMarks\tGrade");
		for(int i=0; i<10; i++)
		{
			if(marks[i]<=50 && marks[i]>=40 )
			{
				System.out.println((i+1) + "\t\t"+marks[i]+"\t"+"PASS");
			}
			else if(marks[i]>=51 && marks[i]<=75 )
			{
				System.out.println((i+1) + "\t\t"+marks[i]+"\t"+"MERIT");
			}
			else if(marks[i]>75 )
			{
				System.out.println((i+1) + "\t\t"+marks[i]+"\t"+"DISTINCTION");
			}
		}

	}

}
