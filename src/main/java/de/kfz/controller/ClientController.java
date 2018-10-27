package de.kfz.controller;

import de.kfz.model.Client;
import de.kfz.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    // Get All Clients
    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

//    // Create a new client
//    @PostMapping("/clients")
//    public Client createClient(@Valid @RequestBody Client client) {
//        return clientRepository.save(client);
//    }

}
