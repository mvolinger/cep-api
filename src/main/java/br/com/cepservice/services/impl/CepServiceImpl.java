package br.com.cepservice.services.impl;

import br.com.cepservice.dto.AddressDTO;
import br.com.cepservice.integrations.client.ViaCepClient;
import br.com.cepservice.services.CepService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient client;

    @Override
    public AddressDTO getAddressByCep(String cep) {
        validateCep(cep);
        return client.getAddressByCep(cep);
    }

    private void validateCep(String cep) {
        if (cep.length() != 8) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP must have eight digits!");
       }
    }
}