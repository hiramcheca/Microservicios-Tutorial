package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usuario.service.models.Moto;

@FeignClient(name = "moto-service", url = "http://localhost:8003")
public interface MotoFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "/moto")
	public Moto save(Moto moto);
	
	@RequestMapping(method = RequestMethod.GET, value = "/moto/usuario/{usuarioId}")
	public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);
}
