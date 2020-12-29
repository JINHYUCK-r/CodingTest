package com.codingTest;

import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1152
//띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어
public class N1152 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int cnt = st.countTokens();
		System.out.println(cnt);

	}

}
