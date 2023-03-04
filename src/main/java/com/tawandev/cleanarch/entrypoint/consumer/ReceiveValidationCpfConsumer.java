package com.tawandev.cleanarch.entrypoint.consumer;

import com.tawandev.cleanarch.core.domain.Customer;
import com.tawandev.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.tawandev.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.tawandev.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidationCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;


    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "tawan")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
