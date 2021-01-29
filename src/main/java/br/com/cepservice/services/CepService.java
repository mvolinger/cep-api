package br.com.cepservice.services;

import br.com.cepservice.dto.AddressDTO;

public interface CepService {
    AddressDTO getAddressBy(String cep);
}
