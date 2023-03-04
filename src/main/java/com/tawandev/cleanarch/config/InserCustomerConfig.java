package com.tawandev.cleanarch.config;

import com.tawandev.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.tawandev.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.tawandev.cleanarch.dataprovider.InsertCustomerImpl;
import com.tawandev.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
