package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {

	/** 
	 * 사용자로부터 한 개의 값을 입력 받아
	 * 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 
	 * 만일 1 미만의 숫자가 입력됐다면
	 * "1 이상의 숫자를 입력해주세요"를 출력하세요.
	 */
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();

		
		if (num1 >= 1) {
			for (int i = 1; i <= num1; i++) {
				System.out.print(i + " ");
			}	
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		  }		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if (num1 >=1) {
			for (int i = num1; i>=1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 보다 큰 숫자를 입력하세요");
		}
	}
	
	public void practice3(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1 >=1) {
			for(int i =1; i<=num1; i++);
			System.out.println("");
		}	
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("입력 2 : ");
			int num2 = sc.nextInt();
			
			if(num1 <= num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			}else  {
			for(int i=num2 ; i<=num1 ; i++) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				return;
				
			
			  }
			}
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("끝 숫자 : ");
		int end = sc.nextInt();

		for(int dan = start ; dan <= end ; dan++) {
			System.out.printf("\n=====%d단=====\n", dan);	
		
			for(int i=1 ; i<=9 ; i++) {
				System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단 : ");
		int start = sc.nextInt();
		
		if (start < 2 || start > 9) {
            System.out.println("2~9 사이 숫자만 입력해주세요");
            return; 
        }
		
		System.out.println("==== 구구단 출력 ====");
		
	
		for(int dan = start ; dan <= 9 ; dan++) {
			System.out.printf("\n=====%d단=====\n", dan);
			
			for(int i=1 ; i<=9 ; i++) {
				System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
			}
		}
	}
	
	// 여기부터 선생님 풀이!!!======================================
	public void practice7() {

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			// 앞쪽 공백 추가 방법 1
			
			for(int blank=1 ; blank<=input-row ; blank++) {
				System.out.print(" ");
			}
			
			for(int col=1 ; col<=row ; col++) {
				System.out.print("*");;
			}
			
			System.out.println(); // 줄바꿈
			
		}
					
		System.out.println("----------------------------------------");
		
		// 방법2
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1 ; col<= input ; col++) {
				
				//앞쪽 공백 추가 방법2
				if(col <= input - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
				
		}
	
	
/**
정수 입력 : 4
   *
  ***
 *****
*******
	 */
	
	
	public void practice11() {
		
		
	}
	
	/**
	 정수 입력 : 5
*****
*   *
*   *
*   *
*****
	 */
	
	public void practice12() {

		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<= input ; row++) {
			for(int col=1 ; col<=input ; col++) {
	
				if(row ==1 || row == input || col==1 || col == input) {
				
				}else {
				
				System.out.print("*");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int count = 0; // 소수를 개수를 세기 위한 변수
		
		// 2 부터 입력 받은 수 까지 1개씩 접근하는 for문
		for(int i=2; i<=num ; i++) {
			boolean flag = true; // 깃발(신호 용도)
			// true인 경우 : 소수 0
			// false인 경우 : 소수 X
			
			// 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			for(int x=2 ; x<i ; x++) {
				if(i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
					flag = false;
					break;
				}
			}
			if(flag) { // 소수라고 판별된 경우 수행
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다\n", num, count);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}		


