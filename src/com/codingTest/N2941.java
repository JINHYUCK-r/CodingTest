package com.codingTest;
<<<<<<< HEAD

import java.util.Scanner;

//https://www.acmicpc.net/problem/2941
//주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
=======
//https://www.acmicpc.net/problem/2941
//주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력

import java.util.Scanner;

>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
public class N2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD

		String str = scan.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'c') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					} else if (str.charAt(i + 1) == '-') {
=======
        
		String str = scan.nextLine();
        
		int count = 0;
 
		for (int i = 0; i < str.length(); i++) {
 
			char ch = str.charAt(i);
 
			if(ch == 'c') {			// 만약 ch 가 c 라면?
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {		//만약 ch 다음 문자가 '=' 이라면?
						// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
						i++;		
					}
					else if(str.charAt(i + 1) == '-') {
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
						i++;
					}
				}
			}
<<<<<<< HEAD

			else if (ch == 'd') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'z') {
						if (i < str.length() - 2) {
							if (str.charAt(i + 2) == '=') {
=======
		    
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {	// dz= 일 경우
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
								i += 2;
							}
						}
					}
<<<<<<< HEAD

					else if (str.charAt(i + 1) == '-') {
=======
		        
					else if(str.charAt(i + 1) == '-') {	// d- 일 경우
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
						i++;
					}
				}
			}
<<<<<<< HEAD

			else if (ch == 'l') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
=======
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// lj 일 경우
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
						i++;
					}
				}
			}
<<<<<<< HEAD

			else if (ch == 'n') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
=======
		    
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// nj 일 경우
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
						i++;
					}
				}
			}
<<<<<<< HEAD

			else if (ch == 's') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			else if (ch == 'z') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
=======
 
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// s= 일 경우
						i++;
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// z= 일 경우
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
						i++;
					}
				}
			}
<<<<<<< HEAD

			count++;

		}

		System.out.println(count);

=======
		    
			count++;
 
		}
 
		System.out.println(count);
>>>>>>> 991e27388788cc3956f1b6d97635ca8e7c2d3f41
	}

}
