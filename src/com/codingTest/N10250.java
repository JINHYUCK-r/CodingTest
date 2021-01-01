package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10250
// H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지 몇번방에 배정 
public class N10250 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			int H = scan.nextInt();	// 층 
			int W = scan.nextInt(); // 넓이 
			int N = scan.nextInt(); // 몇번째 손님 
			
			int F = (N%H)*100; //층수는 나머지로 구할 수 있음 
			int R = (N/H)+1;	//호실은 몫으로 구한수 있음 
			
			if(N%H == 0) {
				System.out.println((H*100) + (N/H));
			}else {
				System.out.println(F + R);
			}
		
		}
		
		

	}

}
