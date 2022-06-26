package com.erd.controller;

import com.erd.model.Client;
import com.erd.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<Client> clientList() {
        return clientService.listOfClients();
    }
    @GetMapping("/{clientId}")
    public Client readClient(@PathVariable Integer clientId){
        return clientService.readClient(clientId);
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping("/update/{clientId}")
    public Client updateClient(@RequestBody Client clientId) {

        return clientService.updateClient(clientId);
    }

    @DeleteMapping("/delete/{clientId}")
    public Client deleteClient(@PathVariable Integer clientId) {
        return clientService.deleteClient(clientId);
    }
}
