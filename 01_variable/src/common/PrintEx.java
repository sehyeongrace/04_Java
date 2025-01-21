package common;

public class PrintEx {
	
	public static void main(String[] args) {
	
	
	// 왼쪽 정렬
	System.out.println(); // 줄바꿈(개행)
	System.out.printf("%-6s/%-6d", name, age);

	// 오른쪽 정렬
	System.out.println(); // 줄바꿈(개행)
	System.out.printf("%6s/%6d", name, age);
	
	// (참고) 0 == 빈칸에 0 추가 (숫자만 가능)
	// 오른쪽 정렬
	System.out.println(); // 줄바꿈(개행)
	System.out.printf("%6s/%06d", name, age);
	
	
	// ----------------------------------------
	// escape 문자
	// - 문자열 내에서 \로 시작하는 특수 문자
	// - \n 또는 \r 또는 \r\n : 줄바꿈
	// - \t : 탭(tab)
	// - \u0000 : 유니코드
	// - \\ : 백슬래시 출력
	// - \' 또는 \" : '," 기호 출력(리터럴 인식 X)
	
	System.out.print("1\t2\t3\n");
	System.out.print("\"홍길동\"의 자료형은 String\r");
	System.out.print("\\o/\n");
	
	
	
	
}
