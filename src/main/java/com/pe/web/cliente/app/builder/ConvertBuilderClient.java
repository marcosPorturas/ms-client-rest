package com.pe.web.cliente.app.builder;

import java.util.Date;

import com.pe.web.cliente.app.dto.request.ClientRequest;
import com.pe.web.cliente.app.dto.response.ClientResponse;
import com.pe.web.cliente.app.dto.response.MemberInfo;
import com.pe.web.cliente.app.dto.response.PersonalInfo;
import com.pe.web.cliente.app.entity.Client;
import com.pe.web.cliente.app.entity.TypeDocument;
import com.pe.web.cliente.app.entity.TypeRelationship;
import com.pe.web.cliente.app.utilitario.Constants;
import com.pe.web.cliente.app.utilitario.Util;

public class ConvertBuilderClient {

	public Client convertToClientEntity(ClientRequest clientRequest) {
		return Client.builder()
				.names(clientRequest.getNames())
				.lastNameFather(clientRequest.getLastNameFather())
				.lastNameMother(clientRequest.getLastNameMother())
				.creationDate(new Date())
				.enabled(Constants.ENABLED)
				.direction(clientRequest.getDirection())
				.birthDate(clientRequest.getBirthDate())
				.membershipDate(new Date())
				.telephone(clientRequest.getTelephone())
				.typeRelationship(TypeRelationship.builder()
						.codRelationship(clientRequest.getTypeRelathionship())
						.build())
				.typeDocument(TypeDocument.builder()
						.codDocument(clientRequest.getTypeDocument())
						.build())
				.numberDocument(clientRequest.getNumberDocument())
				.userValue(clientRequest.getUserValue())
				.passwordValue(clientRequest.getPasswordValue())
				.build();
		
	}
	
	
	public ClientResponse convertToClientResponse(Client client) {
		
		return ClientResponse.builder()
				.codClient(client.getCodClient())
				.names(client.getNames())
				.lastNameFather(client.getLastNameFather())
				.lastNameMother(client.getLastNameMother())
				.personalInfo(converToPersonalInfo(client))
				.memeberInfo(converToMemberInfo(client))
				.build();
	}
	
	
	public PersonalInfo converToPersonalInfo(Client client) {
		return PersonalInfo.builder()
				.telephone(client.getTelephone())	
				.direction(client.getDirection())
				.birthDate(Util.convertToStringDate(client.getBirthDate()))
				.relathionship(client.getTypeRelationship().getDescription())
				.typeDocument(client.getTypeDocument().getShortDescription())
				.numberDocument(client.getNumberDocument())
				.build();
	}
	
	
	public MemberInfo converToMemberInfo(Client client) {
		return MemberInfo.builder()
				.creationDate(Util.convertToStringDate(client.getCreationDate()))
				.membershipDate(Util.convertToStringDate(client.getMembershipDate()))
				.userValue(client.getUserValue())
				.passwordValue(client.getPasswordValue())
				.build();
	}
	
}
