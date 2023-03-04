package com.tawandev.cleanarch.dataprovider.client.mapper;

import com.tawandev.cleanarch.core.domain.Address;
import com.tawandev.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
