package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생하시겠습니까?");
		int answer = sc.nextInt();
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			// 1단계 - JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			conn.setAutoCommit(false);
			
			// 3단계 - SQL실행 객체 생성
			String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000 WHERE `a_no` = ?";
			String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000 WHERE `a_no` = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(2, "101-11-1003");
			
			// 4단계 - SQL실행
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("에러가 발생했습니다!");
			}
			
			psmt2.executeUpdate();
			
			conn.commit();
			
			// 5단계 - 결과처리
			// 6단계 - 연결해제
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("트랜잭션 완료...");
	}
}
