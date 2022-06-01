package com.syntax.class09May28;
import java.util.Scanner;

public class GroupProject {

	public static void main(String[] args) {
//Create a 2D array of integers
		
		int[][] num= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		for(int row=0; row < num.length ;row++) {
			for(int col=0;col<num[row].length;col++) {
				System.out.print(num[row][col]+" ");
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

			}}
