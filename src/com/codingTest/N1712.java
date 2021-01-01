package com.codingTest;

//https://www.acmicpc.net/problem/1712
//총수입(판매비용) > 총비용(고정비용+생산비용) 되는 지점 
import java.util.Scanner;

public class N1712 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();	//고정비용 
		int B = scan.nextInt();	//생산비용 
		int C = scan.nextInt();	// 노트북 가격 
		int cnt = 0;
		
		//C*cnt > A+B*cnt
		//cnt > A/C-B
		
		if(C<=B) {
			System.out.println("-1");
		}else {
			System.out.println(A/(C-B)+1);
		}
		
	}

}
