package test4;

import java.util.HashSet; 
import java.util.Set;
import java.util.TreeSet;

/* 날짜 : 2023/06/30
 * 이름 : 박한산
 * 내용 : 로또번호 연습문제
 * 
 */
public class Test08 {

	public static void main(String[] args) {
		
		for(int  count=1 ; count<=5 ; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() { // return 타입으로 선언
		
		Set<Integer> lottoSet = new HashSet<>(); // 중복 안 되게 집합 사용
		
		for(;;) { // while(true) 랑 같음
				int num = (int) Math.ceil(Math.random() * 45);
					
				lottoSet.add(num);
					
				if(lottoSet.size() == 6) {
					break;
			}
		}
		
		// 정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
