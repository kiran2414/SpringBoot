package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDaoImpl;

    @Override
    public void saveData(Customer customer) {
        customerDaoImpl.saveData(customer);
    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    @Override
    public Customer getDataById(int custId) {
        return customerDaoImpl.getDataById(custId);
    }

    @Override
    public void updateData(int custId, Customer customer) {
        customerDaoImpl.updateData(custId,customer);
    }

    @Override
    public void deleteData(int custId) {
        customerDaoImpl.deleteData(custId);
    }
}
