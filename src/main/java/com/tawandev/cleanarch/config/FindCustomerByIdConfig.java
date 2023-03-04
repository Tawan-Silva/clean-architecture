package com.tawandev.cleanarch.config;

import com.tawandev.cleanarch.core.usecase.impl.FindCustomerbyIdUseCaseImpl;
import com.tawandev.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerbyIdUseCaseImpl findCustomerbyIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerbyIdUseCaseImpl(findCustomerById);
    }
}
