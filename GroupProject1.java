package com.syntax.class09May28;
import java.util.Scanner;

public class GroupProject1 {

	public static void main(String[] args) {
		
	
//Develop a program which will calculate
//the sum of even and odd numbers for that array.
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};	

			System.out.println("Even numbers in array.... ");
			//for (int i=0;i<a.length;i++);
			for(int value:a)
			{
				if(value%2==0)
					System.out.println(value);
			}	
			System.out.println("Odd numbers in array...");
			//for(int i=0;i<a.length;i++)
			//}
				for(int value:a) 
				{
		if(value%2!=0)
			System.out.println(value);
		}}

	}


