package com.tcs.ilp.servlet.services;

import com.tcs.ilp.servlet.beans.CustomerBean;
import com.tcs.ilp.servlet.dao.CustomerDao;

public class CustomerService {
	public int createCustomer(CustomerBean customer){
		CustomerDao customerdao=new CustomerDao();
		return customerdao.addCustomerDetails(customer);
	}
}
