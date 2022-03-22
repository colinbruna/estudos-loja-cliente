package com.loja.cliente.repository;

import com.loja.cliente.document.ClienteDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteDocument, ObjectId> {
}
