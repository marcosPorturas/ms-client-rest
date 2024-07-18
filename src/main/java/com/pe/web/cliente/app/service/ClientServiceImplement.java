package com.pe.web.cliente.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.web.cliente.app.builder.ConvertBuilderClient;
import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;
import com.pe.web.cliente.app.entity.Client;
import com.pe.web.cliente.app.repository.ClientRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ClientServiceImplement implements ClientService{

	@Autowired
	ClientRepository clientRepository;

	@Override
	public Mono<List<ClientResponse>> getAllClientResponse() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(clientRepository.findAll())
				.map(this::invokeClientBuilder)
				.collectList();
				
	}

	@Override
	public Mono<ClientResponse> getClientResponse(Integer codClient) {
		// TODO Auto-generated method stub
		return Mono.just(clientRepository.findById(codClient)
				.orElse(new Client()))
				.map(this::invokeClientBuilder);
	}
	
	@Override
	public Mono<ClientResponse> addClient(ClientRequest clientRequest) {
		// TODO Auto-generated method stub
		return Mono.just(clientRequest)
				.map(this::invokeClientEntityBuilder)
				.map(client->clientRepository.save(client))
				.map(client->clientRepository.findById(client.getCodClient())
						.orElse(new Client()))
				.map(this::invokeClientBuilder);
	}
	
	public ClientResponse invokeClientBuilder(Client client) {
		ConvertBuilderClient convert = new ConvertBuilderClient();
		return convert.convertToClientResponse(client);
		
	}
	
	public Client invokeClientEntityBuilder(ClientRequest clientRequest) {
		ConvertBuilderClient convert = new ConvertBuilderClient();
		return convert.convertToClientEntity(clientRequest);
	}
	
}
