package com.store.client;

import com.store.provider.Provider;
import com.store.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ClientService {
    @Autowired
    public final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public void addNewClient(Client client){

        clientRepository.save(client);
    }
    public void deleteClient(Long clientId){
        boolean exists = clientRepository.existsById(clientId);
        if(!exists){
            throw new IllegalStateException("client with ID "+ clientId + " does not exist");
        }
        clientRepository.deleteById(clientId);
    }

    @Transactional
    public void updateClient(Long clientId,
                              String name ){
        Client client = clientRepository.findById(clientId)
                .orElseThrow(()-> new IllegalStateException("Not Found"));
        if(name != null && !Objects.equals(client.getName(),name)){
            client.setName(name);
        }


    }
}
