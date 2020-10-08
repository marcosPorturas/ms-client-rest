package com.pe.web.cliente.app.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

	
	private String names;
	
	private String lastNameMother;
	
	private String lastNameFather; 
	
	private String telephone;
	
	private String userValue;
	
	private String passwordValue;
	
	private String direction;
	
	private Date  birthDate;
	
	private Integer typeRelathionship;
	
	private Integer typeDocument;
	
	private String numberDocument;
	
}
