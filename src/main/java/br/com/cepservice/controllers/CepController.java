package br.com.cepservice.controllers;

import br.com.cepservice.dto.AddressDTO;
import br.com.cepservice.services.CepService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Api("The CEP API")
@RestController
@RequestMapping(CepController.BASE_URL)
@RefreshScope
@AllArgsConstructor
public class CepController {

    public static final String BASE_URL = "/api";
    public static final String GET_ADDRESS_BY_CEP = "/{cep}";

    private final CepService cepService;

    @ApiOperation(value = "Get address by cep", notes = "This endpoint will bring the address")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Address returned successfully")
    })

    @GetMapping(GET_ADDRESS_BY_CEP)
    @ResponseStatus(HttpStatus.OK)
    public AddressDTO getAddressBy(@PathVariable("cep") String cep) {
            return cepService.getAddressBy(cep);
    }
}
