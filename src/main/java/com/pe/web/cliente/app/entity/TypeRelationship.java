package com.pe.web.cliente.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
