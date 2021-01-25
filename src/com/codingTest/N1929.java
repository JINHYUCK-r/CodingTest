package com.codingTest;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1929
//M이상 N이하의 소수를 모두 출력
public class N1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = scan.nextInt();
		int max = scan.nextInt();
		int check = 0;	//소수인지 아닌지 체크 
		ArrayList answer = new ArrayList();
		
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			if(i == 1) {
				check =1;
			}
			for(int j=2; j<i; j++ ) {
				if(i%j ==0) {	//자기보다 작은수로 나누었을때 나누어지면 소수가 아님 
					check =1;
					break;
				}
			}
			if(check == 0) {
				answer.add(i);
				sum += i;
			}
			check = 0;
		}
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	

	}

}
