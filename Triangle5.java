package com.kartik;

public class Triangle5 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=i;j<=2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		int space=1;
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=2;k++) {
				System.out.print("*");
			}
			space++;
			System.out.println();
		}
	}
}
