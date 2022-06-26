package com.erd.service;

import com.erd.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

     List<Client> listOfClients();

     Client readClient(Integer clientId);

     Client deleteClient(Integer clientId);

     Client updateClient(Client clientId);

     Client createClient(Client client);




}
