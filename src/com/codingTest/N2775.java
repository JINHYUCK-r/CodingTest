package com.codingTest;
//https://www.acmicpc.net/problem/2775
import java.util.Scanner;

public class N2775 {

	public static void main(String[] args) {
		
		int[][] APT = new int[15][15];
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		for(int i = 1; i<15; i++) { // 층수 
			
			for(int j = 2; j<15; j++) { //호수 
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(APT[k][n]);
		}

	}

}
