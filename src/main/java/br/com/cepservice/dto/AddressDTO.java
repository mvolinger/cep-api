package br.com.cepservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

        private String cep;

        private String logradouro;

        private String complemento;

        private String bairro;

        private String uf;

        private Integer ibge;

        private Integer gia;

        private Integer ddd;

        private Integer siafi;
}
