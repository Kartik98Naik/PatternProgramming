package com.kartik;

public class DiamondPattern {
	public static void main(String[] args) {
		int space=3;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			space--;
			
			System.out.println();
		
	}
	
	int n=3;
	int space1=1;
	int star1=5;
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space1;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star1;k++) {
			System.out.print("*");
		}
		space1++;
		star1=star1-2;
		
		System.out.println();
	}
}
}
