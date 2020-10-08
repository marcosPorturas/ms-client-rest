package com.pe.web.cliente.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_type_relationship")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeRelationship {
	
	@Id
	@Column(name="cod_relationship")
	private Integer codRelationship;
	
	private String description;

}
