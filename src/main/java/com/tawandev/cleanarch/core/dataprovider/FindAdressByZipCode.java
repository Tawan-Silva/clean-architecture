package com.tawandev.cleanarch.core.dataprovider;

import com.tawandev.cleanarch.core.domain.Address;

public interface FindAdressByZipCode {

    Address find(final String zioCode);
}
