package com.tawandev.cleanarch.dataprovider.repository.mapper;

import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
