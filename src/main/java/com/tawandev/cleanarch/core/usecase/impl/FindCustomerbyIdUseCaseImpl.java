package com.tawandev.cleanarch.core.usecase.impl;

import com.tawandev.cleanarch.core.dataprovider.FindCustomerById;
import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerbyIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerbyIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
