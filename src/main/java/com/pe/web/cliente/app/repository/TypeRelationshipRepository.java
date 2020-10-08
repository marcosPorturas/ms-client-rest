package com.pe.web.cliente.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.web.cliente.app.entity.TypeRelationship;


@Repository
@Transactional
public interface TypeRelationshipRepository extends JpaRepository<TypeRelationship,Integer>{

}
