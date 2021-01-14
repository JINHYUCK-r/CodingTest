package com.codingTest;
//https://www.acmicpc.net/problem/1011
import java.util.Scanner;

public class N1011 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long T = scan.nextInt();
		for (long i = 0; i < T; i++) {
			long x = scan.nextInt();
			long y = scan.nextInt();
			long length = y - x;
			long answer = 1;
			long dis = 0;

			while (length > dis) {
				answer++;
				dis += answer / 2;
			}
			System.out.println(answer-1);
		}

		}

}
