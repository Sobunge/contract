package com.pensasha.contract.client;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Getting all clients
    @GetMapping("/clients")
    public List<Client> gettingAllClients() {
        return clientService.gettingAllClients();
    }

    // Get a client
    @GetMapping("/client/{id}")
    public Client gettingClient(@PathVariable Long id) {
        return clientService.gettingClient(id);
    }

    // Saving a client
    @PostMapping("/clients")
    public Client addingClient(@RequestBody Client client) {
       
        if(clientService.doesClientNameExist(client.getName())){
            return null;
        }else{
            return clientService.addingClient(client);
        }
        
    }

    // Updating client details
    @PostMapping("/client/{id}")
    public Client updatingClient(@PathVariable Long id, @RequestBody Client client) {
        return clientService.updatingClient(client);
    }

    // Deleting a client
    @GetMapping("/clients/{id}")
    public void deletingClient(@PathVariable Long id) {
        clientService.deletingClient(id);
    }

}
