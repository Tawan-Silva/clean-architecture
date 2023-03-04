package com.tawandev.cleanarch.dataprovider;

import com.tawandev.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.tawandev.cleanarch.core.domain.Address;
import com.tawandev.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.tawandev.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAdressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zioCode) {
        var addressResponse = findAddressByZipCodeClient.find(zioCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
