package com.tawandev.cleanarch.core.usecase.impl;

import com.tawandev.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.tawandev.cleanarch.core.dataprovider.UpdateCustomer;
import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.tawandev.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAdressByZipCode findAdressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAdressByZipCode findAdressByZipCode,
            UpdateCustomer updateCustomer
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAdressByZipCode = findAdressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAdressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
