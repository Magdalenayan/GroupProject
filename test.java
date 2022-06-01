package com.syntax.class09May28;

public class test {

	public static void main(String[] args) {
int[][] num5 = 
        {{1,2,3,4,5,6},
		{5, 6, 7, 8, 9},
		{11, 12, 55, 48}};
		
		int[] odd = new int [5];
		int[] even = new int [5];
		int allodd = 0;
		int alleven = 0;
		
		for(int a=0; a<num5.length; a++) {
			odd[a]=0;
			even[a]=0;
			for(int b=0; b<num5[a].length; b++) {
				if(num5[a][b]%2==0) {
					even[a]+=num5[a][b];
				} else {
					odd[a]+=num5[a][b];
				}
			}
			
			for(int i: odd) {
				allodd+=i;
				}
			for(int i:even) {
				alleven+=i;
			}
		}
System.out.println("Sum of all odd numbers is " + allodd);
System.out.println("Sum of all even numbers is " + alleven);
		
		System.out.println();
	}

}
