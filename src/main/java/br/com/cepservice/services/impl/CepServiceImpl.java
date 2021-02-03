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
        validateCep(cep);
        return client.getAddressBy(cep);
    }

    private void validateCep(String cep) {
        if (cep.length() !=8 )
            throw new RuntimeException("O CEP deve ter oito dígitos!");
    }

}
