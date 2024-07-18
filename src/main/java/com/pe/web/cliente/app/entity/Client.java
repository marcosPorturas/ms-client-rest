package com.pe.web.cliente.app.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_client")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codClient;
	
	private Date creationDate;
	
	private Date updateDate;
	
	private Integer enabled;
	
	private String names;
	
	private String lastNameFather;
	
	private String lastNameMother;
	
	private String  direction;
	
	private Date birthDate;
	
	private Date membershipDate;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "cod_relationship",referencedColumnName="cod_relationship")
	private TypeRelationship typeRelationship;
	
	private String telephone;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "cod_document",referencedColumnName="cod_document")
	private TypeDocument typeDocument;
	
	private String numberDocument;
	
	private String userValue;
	
	private String passwordValue;
	
}
