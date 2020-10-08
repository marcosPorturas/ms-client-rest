package com.pe.web.cliente.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.web.cliente.app.builder.ConvertBuilderClient;
import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;
import com.pe.web.cliente.app.entity.Client;
import com.pe.web.cliente.app.repository.ClientRepository;

import io.reactivex.Observable;
import io.reactivex.Single;

@Service
public class ClientServiceImplement implements ClientService{

	@Autowired
	ClientRepository clientRepository;

	@Override
	public Single<List<ClientResponse>> getAllClientResponse() {
		// TODO Auto-generated method stub
		return Observable.fromIterable(clientRepository.findAll())
				.map(this::invokeClientBuilder)
				.toList();
				
	}

	@Override
	public Single<ClientResponse> getClientResponse(Integer codClient) {
		// TODO Auto-generated method stub
		return Single.just(clientRepository.findById(codClient)
				.orElse(new Client()))
				.map(this::invokeClientBuilder);
	}
	
	@Override
	public Single<ClientResponse> addClient(ClientRequest clientRequest) {
		// TODO Auto-generated method stub
		return Single.just(clientRequest)
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
