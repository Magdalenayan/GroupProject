package com.syntax.class09May28;

public class AAAAA {
public static void main(String[] args) {
//Create a 2D array of integers.Develop a program which will calculate
//the sum of even and add numbers for that array.
	int[][] num = 
{{1,2,3,4,5,6,7,8,9},
{ 10, 11,12,13,14,15},
{16,17,18,19,20}};
	
	


	int[] odd = new int [9];
	int[] even = new int [9];
	int allodd = 0;
	int alleven = 0;
		
	for(int a=0; a<num.length; a++) {
	odd[a]=0;
	even[a]=0;
	System.out.println();
	for(int b=0; b<num[a].length; b++) {
	if(num[a][b]%2==0) {
	even[a]+=num[a][b];
} else {
odd[a]+=num[a][b];
	}}
	for(int i: odd) {
	allodd+=i;
	}
	for(int i:even) {
	alleven+=i;
	}
System.out.println("Sum of all odd numbers is " + allodd);
System.out.println("Sum of all even numbers is " + alleven);
	}
System.out.println();
for(int row=0; row < num.length ;row++) {
	for(int col=0;col<num[row].length;col++) {
		System.out.print(num[row][col]+" ");
	}}}}
