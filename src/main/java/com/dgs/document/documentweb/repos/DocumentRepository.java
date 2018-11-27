package com.dgs.document.documentweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgs.document.documentweb.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
