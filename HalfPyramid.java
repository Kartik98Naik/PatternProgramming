package com.kartik;

public class HalfPyramid {
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
}
}
