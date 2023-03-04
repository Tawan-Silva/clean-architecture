package com.tawandev.cleanarch.core.usecase.impl;

import com.tawandev.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.tawandev.cleanarch.core.dataprovider.InsertCustomer;
import com.tawandev.cleanarch.core.dataprovider.SendCpfForValidation;
import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAdressByZipCode findAdressByZipCode;
    private final InsertCustomer insertCustomer;

    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(
            FindAdressByZipCode findAdressByZipCode,
            InsertCustomer insertCustomer,
            SendCpfForValidation sendCpfForValidation
    ) {
        this.findAdressByZipCode = findAdressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAdressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
