package com.r177219076.q1;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three digits : ");
		int arr[] = new int[3];
		for(int i=0; i<3;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i= 0; i<3 ; i++)
		{
			for(int j = 0; j<3 ; j++)
			{
				for(int k = 0; k<3; k++)
				{
					if(i!=j && j!=k && i!=k) {
						System.out.println(String.valueOf(arr[i])+String.valueOf(arr[j])+String.valueOf(arr[k]));
					}
				}
			}
		}

	}

}
