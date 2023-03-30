package com.pensasha.contract.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Adding a client
    public Client addingClient(Client client) {
        return clientRepository.save(client);
    }

    // Removing a client
    public void deletingClient(Long id) {
        clientRepository.deleteById(id);
    }

    // Updating a client
    public Client updatingClient(Client client) {
        return clientRepository.save(client);
    }

    // Getting a client
    public Client gettingClient(Long id) {
        return clientRepository.findById(id).get();
    }

    // Getting all clients
    public List<Client> gettingAllClients() {
        return clientRepository.findAll();
    }

    // Checking if a client name already exists
    public Boolean doesClientNameExist(String name){
        return clientRepository.existsByName(name);
    }

}
