package com.tawandev.cleanarch.core.usecase;

import com.tawandev.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
