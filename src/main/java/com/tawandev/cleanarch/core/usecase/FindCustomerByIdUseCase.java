package com.tawandev.cleanarch.core.usecase;

import com.tawandev.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
