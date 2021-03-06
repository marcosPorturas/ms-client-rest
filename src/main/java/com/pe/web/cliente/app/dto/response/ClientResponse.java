package com.pe.web.cliente.app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientResponse {
	
	private Integer codClient;
	
	private String names;
	
	private String lastNameMother;
	
	private String lastNameFather;

	private PersonalInfo personalInfo;
	
	private MemberInfo memeberInfo;


}
