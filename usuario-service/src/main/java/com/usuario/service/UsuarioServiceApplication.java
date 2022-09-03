package com.usuario.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.usuario.service.configuration.LoadBalancerConfiguration;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@LoadBalancerClient(name = "usuario-service", configuration = LoadBalancerConfiguration.class)
public class UsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServiceApplication.class, args);
	}

}
