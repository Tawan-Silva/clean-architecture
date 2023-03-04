package com.tawandev.cleanarch.core.usecase;

import com.tawandev.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
