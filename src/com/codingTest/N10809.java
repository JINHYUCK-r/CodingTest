package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10809
//각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는
public class N10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String str = scan.next();
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if(arr[a-'a'] == -1) {
				arr[a-'a'] = i;
			}
				
		}
		for(int val: arr) {
			System.out.println(val);
		}
	}
}
