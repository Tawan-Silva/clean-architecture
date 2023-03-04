package com.tawandev.cleanarch.entrypoint.controller.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank
    public String name;

    @NotBlank
    public String cpf;

    @NotBlank
    public String zipCode;
}
