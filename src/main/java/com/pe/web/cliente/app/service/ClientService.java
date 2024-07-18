package com.pe.web.cliente.app.service;

import java.util.List;

import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;

import reactor.core.publisher.Mono;

public interface ClientService {

	Mono<List<ClientResponse>> getAllClientResponse();
	Mono<ClientResponse> getClientResponse(Integer codClient);
	Mono<ClientResponse> addClient(ClientRequest clientRequest);
}
