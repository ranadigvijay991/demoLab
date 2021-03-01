package com.r177219076.q4;
public class Ques4 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=41;i<250;i++)
		{
			if(i%5==0)
				sum = sum+i;
		}
		System.out.println("Sum is : "+sum);

	}

}
