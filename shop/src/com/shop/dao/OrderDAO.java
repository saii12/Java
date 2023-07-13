package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
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
		return 0;
	}
	public OrderVO selectorder(int orderNo) {
		return null;
	}
	public List<OrderVO> selectorders() {
		return null;
	}
	public int updateorder(OrderVO vo) {
		return 0;
	}
	public int deleteorder(int orderNo) {
		return 0;
	}
}

