package com.example.thstoreprocedurecms.service;

import com.example.thstoreprocedurecms.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
