package com.dilermando.cep.consumers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dilermando.cep.domain.Cep;

@FeignClient(value = "viacep-consumer", url = "https://viacep.com.br/")
public interface ViaCepConsumers {

	@GetMapping(value = "/ws/{cep}/json")
	Cep getCep(@PathVariable("cep") String cep);

}