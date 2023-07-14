package com.shop.dao;

import java.util.List;

import com.shop.vo.CustomerVO;

public class CustomerDAO {

	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	public int insertCustomer(CustomerVO vo) {
		int result = 0;
	}
	public CustomerVO selectCustomer(String custId) {
		CustomerVO vo = null;
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
