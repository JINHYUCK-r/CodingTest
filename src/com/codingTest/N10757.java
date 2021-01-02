package com.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//https://www.acmicpc.net/problem/10757
// 큰수 더하기
public class N10757 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		BigInteger A = new BigInteger(s[0]);
		BigInteger B = new BigInteger(s[1]);
		System.out.println(A.add(B));

	}

}
