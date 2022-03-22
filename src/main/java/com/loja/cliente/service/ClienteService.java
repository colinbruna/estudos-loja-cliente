package com.loja.cliente.service;

import com.loja.cliente.document.ClienteDocument;
import com.loja.cliente.dto.Cliente;
import com.loja.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> getClientes() {
        List<ClienteDocument> listDocument = repository.findAll();
        List<Cliente> clientes = new ArrayList<>();

        for (ClienteDocument clienteDocument : listDocument) {
            Cliente cliente = new Cliente();
            cliente.setNome( clienteDocument.getNome() );
            clientes.add(cliente);
        }
        return clientes;
    }

}
