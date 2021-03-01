package br.com.cepservice.services;

import br.com.cepservice.dto.AddressDTO;

public interface CepService {

    AddressDTO getAddressByCep(String cep);
}
