package org.comstudy21.ex01;

public class Hello01 {
/**
 * 문서화 시킬 수 있는 JAVA 전용 주석
 * 이것 여러 줄 주석 가능
 * @작성자 : 서승현
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이것은 한줄 주석
		// 줄을 바뀌면 자동으로 주석 해제 
		System.out.println("Hello World");
		System.out.print("성명: "); //자동 줄바꿈 안된다.
		System.out.println("홍길동");
	}

}
/* 이것은 여러줄 주석
줄이 바뀌어도 주석이 유지된다
*/