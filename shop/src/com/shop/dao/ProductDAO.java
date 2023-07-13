package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// 기본 CRUD 메서드
	public int insertproduct(ProductVO vo) {
		return 0;
	}
	public ProductVO selectproduct(int prodNo) {
		return null; //리턴값 주고 타입지정하는듯
	}
	public List<ProductVO> selectproducts() {
		return null;
	}
	public int updateproduct(ProductVO vo) {
		return 0;
	}
	public int deleteproduct(int prodNo) {
		return 0;
	}
	
}
