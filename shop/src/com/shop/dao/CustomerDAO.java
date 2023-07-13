package com.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper {

	// 싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	
	
	// 기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr()); //vo 객체를 통해 데이터베이스에 입력
			
			// 0:실패, 1:성공
			result = psmt.executeUpdate(); //INSERT 할 때 row count 1 또는 0 값(기본키에 중복되는 값 넣으려고 할때=insert불가) 나옴
			
			close();
		
		}catch (SQLIntegrityConstraintViolationException e) { // 뜨는 오류 복붙
			System.out.println("이미 사용중인 아이디입니다.");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public CustomerVO selectCustomer(String custId) {
	
		CustomerVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5)); //데이터베이스에서 조회된 레이블을 vo객체로 생성
			}
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo; // 메서드 안에서 return을 해주려면 메서드 안에서 선언, 초기화 해야함
	}
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	public int deleteCustomer(String custId) {
		return 0;
	}
	
	
}
























