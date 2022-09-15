package com.example.thstoreprocedurecms.repository;

import com.example.thstoreprocedurecms.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
