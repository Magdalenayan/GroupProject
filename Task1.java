package com.syntax.class09May28;

public class Task1 {

	public static void main(String[] args) {
//Create an array of chars and store grades into it:
//A,B,C,D,E,F.
//Then print a grade B(use 2 different ways of creating an array)
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
System.out.println("--------------------------------------------------");
		

		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
//System.out.println(grade[0]);
//System.out.println(grade[1]);
//System.out.println(grade[2]);
//System.out.println(grade[3]);
//System.out.println(grade[4]);
//System.out.println(grade[5]);
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		}
		
System.out.println("--------------------------------------------");
// Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using elements of array:
//“Saturday is Java coding Day”. 

		String[] word=new String[5];
		word[0]="Java ";
		word[1]="Saturday ";
		word[2]="day.";
		word[3]="coding ";
		word[4]="is ";
		
System.out.println(word[1]+word[4]+word[0]+word[3]+word[2]);

System.out.println("-------------------------------------------------");

for (int i=0; i<grade.length;i++) {
System.out.print(grade[i]+" ");
}
System.out.println();
String[] words= {"Java","Saturday","day"};
//I want to retrieve all elements
for(int i=0; i< words.length; i++) {
	System.out.print(words[i]+" ");
	
}
System.out.println("The End");
	}

	
	
	

}
}