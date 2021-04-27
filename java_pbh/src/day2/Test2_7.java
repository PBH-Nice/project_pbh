package day2;

import java.util.Scanner;

public class Test2_7 {

	public static void main(String[] args) {
		/*
		 * 평년의 월의 마지막 일수를 출력하는 코드를 작성하세요.
		 * 31 : 1,3,5,7,8,10,12
		 * 30 : 4,6,9,11
		 * 28 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int m = sc.nextInt();
		
		if(m == 2) {
			System.out.println(m + "월은 28일까지 있습니다.");
		} else if(m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println(m + "월은 30일까지 있습니다.");
		} else {
			System.out.println(m + "월은 31일까지 있습니다.");
		}
		
		sc.close();
	}

}
