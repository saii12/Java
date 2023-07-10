package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* 날짜 : 2023/07/10		
 * 이름 : 박한산
 * 내용 : Insert 실습하기
 * 
 */
public class SelectTest {

	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL실행
			String sql = "SELECT * FROM `User1`";
			ResultSet rs = stmt.executeQuery(sql); //select 실행했을 때 보여지는 것
			
			// 5단계 - 결과처리(SELECT 경우)
			while(rs.next()) {
				
				String uid = rs.getString(1); //index 값 아니고 순서번호/ 칼럼에서 next 한 후 해당 레이블(로우)에서 첫번째 값
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s, %s, %s, %d\n", uid, name, hp, age);
			}
			
			
			// 6단계 - 연결해제
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Select 완료...");
	}
}
