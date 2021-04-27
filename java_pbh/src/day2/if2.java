package day2;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		/*
		 * 변수 num에 정수를 입력받아 입력받은 정수가 짝수이면 짝수라고 출력하는 코드를 작성하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result = "";
		if(num % 2 == 0) {
			result = "짝수";
		}
		System.out.println(result);
		
		/*
		 * 홀수
		 */
		if(num % 2 == 1) {
			result = "홀수";
		}
		System.out.println(result);
		sc.close();
	}

}
