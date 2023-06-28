package sub2;

import java.util.Stack;

/**
 * 날짜 : 2023/06/28
 * 이름 : 박한산
 * 내용 : Java 자료구조 스텍 실습하기
 *
 * 스택(stack)
 * - 스택은 데이터가 순서대로 쌓이는 자료구조(LIFO:후입선출)
 * - 변수 선언과 메서드 실행에 사용
 */
public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //제네릭은 객체만 취급 기본타입은 취급X(int)
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
	
		while(!stack.empty()) { //stack이 비어있지 않다면
			System.out.println("stack pop: " + stack.pop());
		}
	}
}
