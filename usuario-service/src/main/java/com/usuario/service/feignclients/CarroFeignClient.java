package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.usuario.service.models.Carro;

@FeignClient(name = "carro-service", url = "http://localhost:8002", path = "/carro")
public interface CarroFeignClient {

	@PostMapping
	public Carro save(Carro carro);
	
	@GetMapping(value = "/usuario/{usuarioId}")
	public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
	
}
