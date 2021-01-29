package br.com.cepservice.services.impl;

import br.com.cepservice.dto.AddressDTO;
import br.com.cepservice.integrations.client.ViaCepClient;
import br.com.cepservice.services.CepService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient client;

    @Override
    public AddressDTO getAddressBy(String cep) {
//        this.validateCep(cep);
        return client.getAddressBy(cep);
    }

//    private void validateCep(String cep) {
//        (cep.length() !=8) {
//        }
//
//        throw Exception

    }
