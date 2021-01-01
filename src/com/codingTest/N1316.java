package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1316
//각 문자가 연속하는 그룹단어의 개수

public class N1316 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean check() {
		//각 알파벳 위치 
		boolean[] check = new boolean[26];
		String str = scan.next();
		//최초의 위치 및 글자위치 담길곳 
		int prev = 0;

		//글자 길이 만큼 반복 
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			//이전 글자와 현재의 글자가 다르다면 
			if (prev != now) {
				//각 글자위치의 불린체크를해서 이전에 나온글자가 있는지 확인 
				//나온적이 없다면  
				if (check[now - 'a'] == false) {
					//트루로 바꿔주고 
					check[now - 'a'] = true;
					//이전글자를 현재 글자로 바꿈 
					prev = now;
				} else {
					//나온적이 있다면 그룹단어가 아니니깐 false를 리턴 
					return false;
				}
				//같은 글자면 그냥 무시하고 계속 진행 
			} else {
				continue;
			}

		}
		//그룹단어니깐 true 리턴 
		return true;
	}
}
