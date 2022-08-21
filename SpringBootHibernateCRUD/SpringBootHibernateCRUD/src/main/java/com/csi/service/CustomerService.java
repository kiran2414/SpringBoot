package com.csi.service;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerService {
    public void saveData(Customer customer);
    public List<Customer> getAllData();
    public Customer getDataById(int custId);
    public void updateData(int custId,Customer customer);
    public void deleteData(int custId);
}
