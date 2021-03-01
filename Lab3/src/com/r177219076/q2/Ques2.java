package com.r177219076.q2;
import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter ten no.s : ");
		for(int i=0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<10; i++)
		{
			int sq = arr[i] * arr[i];
			sum = sum + sq;
		}
		System.out.println("Sum of the squares of the no.s is : " + sum);
	}

}
