package com.pe.web.cliente.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.web.cliente.app.entity.TypeDocument;

@Repository
@Transactional
public interface TypeDocumentRepository extends JpaRepository<TypeDocument,Integer>{

}
