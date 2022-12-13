package com.kartik;

public class InvertedHalfPyramid {
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
	}
}
