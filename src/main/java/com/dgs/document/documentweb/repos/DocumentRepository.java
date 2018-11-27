package com.dgs.document.documentweb.repos;

import org.springframework.data.repository.CrudRepository;

import com.dgs.document.documentweb.entities.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {

}
