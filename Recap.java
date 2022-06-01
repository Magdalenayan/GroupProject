package com.syntax.class09May28;

public class Recap {

	public static void main(String[] args) {
		
	
for (int i=1; i<=5; i++) {
	System.out.println("Hello");//5
	for(int y=1; y>=3; y++) {
		System.out.println("Bye");//0
	}}
System.out.println("--------------------------");
			
		for (int a=1; a<=5; a--) {
			System.out.println("Hello");//1 2 3
			for(int c=1; c<=3; c++) {               
				System.out.println("Bye");//3 3 3 3 
System.out.println("----------------------------");
		
		for (int b=1; b<=5; b++) {
			System.out.println("Hello"+b);//5
			for(int z=1; z<=3; z--) {               
				System.out.println("Bye"+z);//5
		      break;
			}}
System.out.println("------------------------");

for (int d=1; d<=5; d++) {
	System.out.println("Hello");
	for(int n=1; n<=3; n++) {   
		continue;
		//System.out.println("Bye");
          
		      
	}}}}}}


