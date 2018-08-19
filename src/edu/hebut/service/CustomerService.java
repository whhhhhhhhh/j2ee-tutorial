package edu.hebut.service;

import edu.hebut.dao.CustomerDao;
import edu.hebut.model.Customer;

import java.util.List;

public class CustomerService {

    CustomerDao customerDao = new CustomerDao();

    public List<Customer> listCustomer() {
        return customerDao.selectAllCustomer();
    }

    public void addCustomer() {
    }
}
