package onlineShop.service;

import org.springframework.stereotype.Service;

import onlineShop.model.Customer;
@Service
public interface CustomerService {
	void addCustomer(Customer customer);

    Customer getCustomerByUserName(String userName);

}
