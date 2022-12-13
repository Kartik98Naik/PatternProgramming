package com.kartik;

public class Pattern6 {
public static void main(String[] args) {
	int n=4;
	int space=0;
	int star=7;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		space++;
		star=star-2;
		
		System.out.println();
	}
	
int space1=3;
	
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=space1;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		space1--;
		
		System.out.println();
	}
}
}
