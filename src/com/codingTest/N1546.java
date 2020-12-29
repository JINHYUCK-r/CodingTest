package com.codingTest;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

//https://www.acmicpc.net/problem/1546
//최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//새로운 평균을 구하는 프로그램을
public class N1546 {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		int num = scan.nextInt();
		double[] arr = new double[num];
		for(int i=0; i<num; i++) {
			arr[i] = scan.nextDouble();	
		}
		Arrays.sort(arr);
		
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/arr[arr.length-1])*100;
		}
		System.out.println(sum/arr.length);
		

	}

}
