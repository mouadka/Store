package com.store.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ProviderService {
    @Autowired
    public final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public List<Provider> getProviders(){
        return providerRepository.findAll();
    }

    public void addNewProvider(Provider provider){

        providerRepository.save(provider);
    }
    public void deleteProvider(Long providerId){
        boolean exists = providerRepository.existsById(providerId);
        if(!exists){
            throw new IllegalStateException("provider with ID "+ providerId + " does not exist");
        }
        providerRepository.deleteById(providerId);
    }

    @Transactional
    public void updateProvider(Long providerId,
                              String name ){
        Provider provider = providerRepository.findById(providerId)
                .orElseThrow(()-> new IllegalStateException("Not Found"));
        if(name != null && !Objects.equals(provider.getName(),name)){
            provider.setName(name);
        }


    }
}
