package com.array;

public class Array1 {

	public static void main(String[] args) {
		
		int [][] flat= new int [2][3];
		
		flat [0][0]=1;
		flat [0][1]=2;
		flat [0][2]=3;
		flat [1][0]=4;
		flat [1][1]=5;
		flat [1][2]=6;
		for (int i = 0; i < flat.length; i++) {
			for (int j = 0; j <flat[i].length; j++) {
				System.out.print(flat[i][j]+"\t");
			}
			System.out.println();
		}
	}
}