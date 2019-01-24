package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 메소드
 * 기타 : 생성된 객체가 수행할 수 있는 행위를 기술한 것
 * 		[메소드 접근 제어자]
 *      1) private : 클래스의 내부에서만 접근가능하며 외부에서 접근 불가
 *      2) 생략(디폴트) : 동일한 패키지에 있는 클래스에서만 접근이 간으
 *      3) protected : 동일한 패키지에 있는 클래스 및 서브클래스에서 접근이 가능
 *      4) public : 제약없이 어디에서나 접근이 가능
 *      
 *      [메소드 이름] : 식별자로 사용자에 의해 만들어지며, 일반적으로 소문자로 시작
 * */

// 클래스
class Task5 {
	
}

// 클래스
public class Task_Ex5 {
	
	// 메소드 
	// 메소드 리턴타입 : 처리된 결과를 호출한 곳으로 되돌려 줄 때의 데이터 형
	// void는 호출한 곳으로 되돌려 줄 데이터가 없을때 사용
	public int sum (int n) { // int : 메소드 리턴타입 / (int n) : 파라미터
		// 지역변수
		int s = 0; 
		
		// 전달받은 매개변수 만큼 반복 1 ~ n까지
		for (int i = 1; i <=n; i++) {
			s += i; // 1 ~ n까지의 합
		}
		
		// 메소드 리턴값 : 호출한 곳으로 리턴 값을 넘김
		// return되는 값은 메소드 리턴 타입과 동일한 자료형이거나 작아야한다.
		return s;
	}
	
	// 메소드 파라미터(Parameter) : 메소드를 호출한 곳에서 메소드에 값을 전달할 때 사용
	// 파라미터는 지역 변수로 메소드 내에서만 사용 가능 (stack 메모리 영역에 메모리 할당)
	public int sum2 (int n) { 
		// 지역변수
		int s = 0; 
		
		// 메소드 리턴값
		return s;
	}
	
	public void sum3 (int n) { 
		// 메소드 리턴값이 void형인 경우 return; 생략 가능
	}
	
	public static void main(String[] args) {
		// 메모리 stack 영역
		// 자료의 삽입과 삭제가 한쪽 에서만 수행되는 선형 구조
		// LIFO(Last In First Out) 구조
		// push : 삽입, pop : 데이터 삭제. top : 스택의 가장 위 데이터를 가리키는 위치, bottom : 스택의 가장 밑 데이터를 가리키는 위치
	}
}