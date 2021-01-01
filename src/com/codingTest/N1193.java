package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1193
//지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수 X가 주어졌을 때, X번째 분수

public class N1193 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int crossCnt = 1; //대각선 개수 
	int crossSum = 0; // 대각선 합 
	while(true) {
		if(x<=crossCnt + crossSum) {
			//대각선이 홀수  번째라면 분모가 작은것에서 큰것으로 왼쪽에서 오른쪽으로 
			//분모는 입력값-대각선의 합 => x - crossSum 
			//분자는 분모+분자의 값이 대각선 개수보다 1작아야하기때문에 
			//분모 + 분자 = 대각선 개수 +1 => crossCnt + 1
			// 분자  = 대각선 개수 +1 - 분모 
			//분자 = 대각선 개수 + 1 -(입력값-대각선의 합) = > crossCnt + 1 -(x - crossSum)
			if(crossCnt %2 == 1) {
				System.out.println((crossCnt + 1 -(x - crossSum)) + "/" + (x - crossSum) );
				break;
			//대각선이 짝수 번째라면 홀수의 반대로 출력   	
			}else if(crossCnt %2 ==0) {
				System.out.println( (x - crossSum)+ "/" +  (crossCnt + 1 -(x - crossSum)));
				break;
			}
			
		}else {
			crossSum = crossSum + crossCnt;
			crossCnt ++;
		}
	}

	}

}
