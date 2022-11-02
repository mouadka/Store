package com.store.client;

import com.store.provider.Provider;
import com.store.provider.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {

        this.clientService = clientService;
    }
    @GetMapping
    public List<Client> getClients(){

        return clientService.getClients();
    }
    @PostMapping
    public void addClient(@RequestBody Client client){
        clientService.addNewClient(client);

    }
    @DeleteMapping(path = "{clientId}")
    public void deleteProvider(@PathVariable("clientId") Long clientId){
        clientService.deleteClient(clientId);
    }

    @PutMapping(path = "{clientId}")
    public void updateClient(@PathVariable("clientId") Long clientId,
                               @RequestParam(required = false) String name){
        clientService.updateClient(clientId, name);
    }

}
