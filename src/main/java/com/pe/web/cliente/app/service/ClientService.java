package com.pe.web.cliente.app.service;

import java.util.List;

import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;

import io.reactivex.Single;

public interface ClientService {

	Single<List<ClientResponse>> getAllClientResponse();
	Single<ClientResponse> getClientResponse(Integer codClient);
	Single<ClientResponse> addClient(ClientRequest clientRequest);
}
