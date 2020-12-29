package com.codingTest;

import java.util.HashSet;
import java.util.Scanner;

//https://www.acmicpc.net/problem/3052
//42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는

public class N3052 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	HashSet<Integer> h = new HashSet<Integer>();

	for(int i = 0;i<10;i++){
		h.add(scan.nextInt() % 42);
	}
	System.out.println(h.size());

}}