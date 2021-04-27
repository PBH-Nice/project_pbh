package day2;

import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 6의 배수이면 6의 배수라고 출력하고,
		 * 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력한 코드 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 6 == 0) {
			System.out.println("6의 배수입니다.");
		} else if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
