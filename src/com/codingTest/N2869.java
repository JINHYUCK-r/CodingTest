package com.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



//https://www.acmicpc.net/problem/2869
//  V미터 나무. 낮에 A미터 올라가기.밤에 잠을 자는 동안 B미터 미끄러짐 . 또, 정상에 올라간 후에는 미끄러지지 않는다.
//며칠이 걸리는가 


public class N2869 {
/*
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		
		int Ac = 0;
		int Bc = 0;
		int Vc = 0;
		
		while(true) {
		Ac++;
		Vc = Vc + A;
			if(Vc >= V) {
				System.out.println(Ac);
				break;
			}
		Bc++;
		Vc = Vc -B;	
		}	
		}

	}
	
	*/
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
	int A = Integer.parseInt(st.nextToken());
	int B = Integer.parseInt(st.nextToken());
	int V = Integer.parseInt(st.nextToken());
	
	int day = (V-B)/ (A-B);
	if(((V-B)% (A-B)) != 0 ){
		day++;
	}
	System.out.println(day);
}
}














