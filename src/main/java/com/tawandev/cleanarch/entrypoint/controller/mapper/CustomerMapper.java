package com.tawandev.cleanarch.entrypoint.controller.mapper;

import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.entrypoint.controller.reponse.CustomerResponse;
import com.tawandev.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
