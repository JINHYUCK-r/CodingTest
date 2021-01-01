package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2839
//정확하게 N키로그램배달. 3키로 5키로이용  
public class N2839 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int gram = scan.nextInt();
		int cnt = 0;
		
		if(gram ==4 || gram == 7) {
			cnt = -1;
		}else if(gram%5 == 0) {
			cnt = (gram/5);
		}else if(gram%5 == 1 || gram%5 ==3) {
			cnt = (gram/5)+1;
		}else if(gram%5 == 2 || gram%5 ==4) {
			cnt = (gram/5)+2;
		
		}
		System.out.println(cnt);

	}
}

