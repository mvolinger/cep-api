package br.com.cepservice.integrations.client;

import br.com.cepservice.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "via-cep", url = "https://viacep.com.br/ws/")
    public interface ViaCepClient {

    @GetMapping("{cep}/json")
    AddressDTO getAddressBy(@PathVariable("cep") String cep);
}

