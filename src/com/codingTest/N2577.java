package com.codingTest;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2577
//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지
public class N2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value = (scan.nextInt() * scan.nextInt() * scan.nextInt());
		String str = Integer.toString(value);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j) -'0' == i) {
					count++;
				}
				System.out.println(count);
			}
		}
	}

}
