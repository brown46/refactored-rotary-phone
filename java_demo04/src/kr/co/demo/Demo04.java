package kr.co.demo;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * 		프로그램 수행 흐름을 바꾸는 역할을 하는 제어문중 하나로 
		 * 		특정 문장을 반복해서 수행하도록 한다.
		 * 
		 * 		반복문은 for, while 두 가지의 반복문이 있다.
		 * 
		 * for(초기식; 조건식; 증감식){
		 * 		반복 실행할 코드
		 * }
		 * 
		 * 초기식: 변수를 초기화 하기 위한 식이 위치한다.(생략가능 ';'은 생략불가)
		 * 		반복문이 시작할 때 최초 1회만 동작
		 * 조건식: 반복문을 계속 수행할지에 대한 조건이 위치한다.(생략가능 ';'은 생략불가)
		 * 		조건식의 결과가 참이면 반복문 안의 코드 실행
		 * 		조건식의 결과가 거짓이면 반복문을 중단하고 다음 코드로 넘어감
		 * 		반복문이 시작할 때 뿐만아니라 계속 반복이 이루어지면 계속 실행한다.
		 * 증감식: 보통 초기식에서 초기화한 변수의 값을 증감시키기 위해 사용(생략가능)
		 * 		반복문의 마지막 코드가 실행된 후에 수행하는 코드
		 * 		반복이 이루어지면 계속 실행한다.반복문이 시작할 때에는 동작안함.
		 * 
		 * for 반복문에서 초기식, 조건식, 증감식을 모두 생략하면 무한 반복이된다.
		 * for 반복문에서 조건식을 잘못 설정하면 무한 반복 또는 반복 안함.
		 * 
		 * 반복문 안에 break를 사용하면 반복문을 중단 할 수 있다.
		 * 반복문 안에 continue를 사용하면 반복문의 처음으로 이동한다.
		 * 
		 */
		
		int x ;
		for(x=1;x<=3;x++) {
			System.out.printf("반복 횟수 및 변수에 저장된 값 ->%d회/%d\n",x,x);
		}
		System.out.printf("변수 x에 저장된 최종값->%d",x);
	
		for(int x2=1;x2<=3;x2++) {
			System.out.printf("반복 횟수 및 변수에 저장된 값 ->%d회/%d\n",x2,x2);
		}
		//System.out.printf("변수 x에 저장된 최종값->%d",x2);
			

	}

}
