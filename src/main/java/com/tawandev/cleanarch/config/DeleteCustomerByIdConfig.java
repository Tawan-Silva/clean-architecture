package com.tawandev.cleanarch.config;

import com.tawandev.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.tawandev.cleanarch.core.usecase.impl.FindCustomerbyIdUseCaseImpl;
import com.tawandev.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdConfig(
            FindCustomerbyIdUseCaseImpl findCustomerbyIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerbyIdUseCase, deleteCustomerById);
    }
}
