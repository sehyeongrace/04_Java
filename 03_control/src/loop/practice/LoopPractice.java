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
		
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("정수 입력 : ");
			int star = sc.nextInt();
		
			if(star > 0) {
				for(int i = 1; i <= star; i++) {
					
					System.out.println("*");
					
				System.out.println();
				}
			}else {
					System.out.println("오류");
					
		
				
		}
	}
	
}		


