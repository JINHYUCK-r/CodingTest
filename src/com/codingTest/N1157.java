package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1157
//가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을
public class N1157 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String str = scan.next();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if('A'<=a && a<='Z') {
				arr[a-'A']++;
			}else if ('a'<=a && a<='z'){
				arr[a-'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
