package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	// 기본 CRUD 메서드
	public int insertorder(OrderVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			
			result = psmt.executeUpdate(); // 제품번호 없는 걸 주문할 수는 없으니까(insert안됨) 0값도 있는 건데 여기선 외래키로 안되어있음
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public OrderVO selectorder(int orderNo) {
		return null;
	}
	public List<OrderVO> selectorders(String orderId) {
		
		List<OrderVO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, orderId); // 1. oredrId에 해당하는 레이블을 객체로 만든다. 2. 이 객체를 리스트에 넣는다.
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));
				vo.setOrderId(rs.getString(2));
				vo.setOrderProduct(rs.getInt(3));
				vo.setOrderCount(rs.getInt(4));
				vo.setOrderDate(rs.getString(5).substring(0, 16)); //substring index 0번 값 부터 16개(공백포함)
				vo.setName(rs.getString(6));
				vo.setProdName(rs.getString(7));
			
				orders.add(vo);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return orders;
	}
	public int updateorder(OrderVO vo) {
		return 0;
	}
	

	
	public int deleteorder(int orderNo) {
		return 0;
	}
}

