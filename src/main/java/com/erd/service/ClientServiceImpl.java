package com.erd.service;

import com.erd.model.Client;
import com.erd.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Client> listOfClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client readClient(Integer clientId) {
        return clientRepository.findAll().stream().filter(client -> client.getClientId().equals(clientId)).findFirst().orElse(null);
    }

    @Override
    public Client deleteClient(Integer clientId) {
        Client client = readClient(clientId);
        clientRepository.delete(client);
        return client;
    }

    @Override
    public Client updateClient(Client updateClient) {

        return clientRepository.save(updateClient);
    }

    @Override
    public Client createClient(Client createClient) {

        return clientRepository.save(createClient);
    }
}
