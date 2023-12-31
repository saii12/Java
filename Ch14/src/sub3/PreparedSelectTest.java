package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* 날짜 : 2023/07/11	
 * 이름 : 박한산
 * 내용 : PreparedStatement 실습하기
 * 
 * PreparedStatement
 *  - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 *  - Query Parameter에 값을 Mapping 시켜 쿼리 실행
 *  
 *  VO(Value Object)객체
 *  - 도메인 값을 속성을 갖는 객체
 *  - 테이블 객체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 *  - DTO 구분
 * 
 */

// VO객체 : 테이블 개체(Entity)가 변환되는 객체
class User2VO { // 데이터베이스 table의 Entity가 convert 되는 특별한 클래스
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class PreparedSelectTest {

	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/userdb"; //localhost나 127.0.0.1이나 같음
		String user = "root";
		String pass = "1234";
		
		// 결과처리에 사용할 리스트 생성
		List<User2VO> users = new ArrayList<>();
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			String sql = "SELECT * FROM `User2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과처리(SELECT 경우)
			while(rs.next()) { //데이터베이스의 하나의 레이블(행=로우)은 개체(Entity)이다, 이 개체를 자바의 객체로
				// VO객체 생성 및 초기화
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				// VO객체 List 저장
				users.add(vo); // 데이터베이스 각 Entity의 uid, name, hp, age을 속성으로 갖는 vo객체들을 리스트에 저장
			}
			
			// 6단계 - 연결해제
			rs.close();
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// List 결과출력
		
		for(User2VO vo : users) {
			System.out.println("--------------------");
			System.out.println("아이디 : " + vo.getUid());
			System.out.println("이름 : " + vo.getName());
			System.out.println("휴대폰 : " + vo.getHp());
			System.out.println("나이 : " + vo.getAge());
			System.out.println("--------------------");
		}
	}
}