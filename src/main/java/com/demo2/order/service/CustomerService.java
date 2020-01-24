/* 
 * Created by 2019年1月13日
 */
package com.demo2.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo2.order.entity.Address;
import com.demo2.order.entity.Customer;

/**
 * The service of customer
 * @author fangang
 */
@FeignClient(value="service-customer")
public interface CustomerService {
	/**
	 * save a customer
	 * @param customer
	 */
	@PostMapping("orm/customer/save")
	public void save(@RequestParam("customer")Customer customer);
	/**
	 * delete a customer
	 * @param id
	 */
	@GetMapping("orm/customer/delete")
	public void delete(@RequestParam("id")long id);
	/**
	 * @param id
	 * @return the customer of the id.
	 */
	@GetMapping("orm/customer/load")
	public Customer load(@RequestParam("id")long id);
	
	/**
	 * @param id
	 * @return the address of the id
	 */
	@GetMapping("orm/customer/loadAddress")
	public Address loadAddress(@RequestParam("id")long id);
}
