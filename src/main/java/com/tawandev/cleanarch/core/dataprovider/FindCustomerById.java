package com.tawandev.cleanarch.core.dataprovider;

import com.tawandev.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
