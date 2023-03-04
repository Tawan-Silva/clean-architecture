package com.tawandev.cleanarch.config;

import com.tawandev.cleanarch.core.usecase.impl.FindCustomerbyIdUseCaseImpl;
import com.tawandev.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.tawandev.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.tawandev.cleanarch.dataprovider.FindCustomerByIdImpl;
import com.tawandev.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerbyIdUseCaseImpl findCustomerbyIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerbyIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
