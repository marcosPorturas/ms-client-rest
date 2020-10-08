package com.pe.web.cliente.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;
import com.pe.web.cliente.app.service.ClientService;

import io.reactivex.Single;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	
	@GetMapping("/all")
	public Single<List<ClientResponse>> getAllClient(){
		return clientService.getAllClientResponse();
	}
	
	@GetMapping("/{codClient}")
	public Single<ClientResponse> getClient(@PathVariable("codClient")Integer codClient){
		return clientService.getClientResponse(codClient);
	}

	@PostMapping("/add")
	public Single<ClientResponse> addClient(@RequestBody ClientRequest clientRequest){
		return clientService.addClient(clientRequest);
	}
	
}
