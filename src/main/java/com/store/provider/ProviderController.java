package com.store.provider;

import com.store.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    public ProviderController(ProviderService providerService) {

        this.providerService = providerService;
    }
    @GetMapping
    public List<Provider> getProviders(){

        return providerService.getProviders();
    }
    @PostMapping
    public void addProvider(@RequestBody Provider provider){
        providerService.addNewProvider(provider);

    }
    @DeleteMapping(path = "{providerId}")
    public void deleteProvider(@PathVariable("provoderId") Long providerId){
        providerService.deleteProvider(providerId);
    }

    @PutMapping(path = "{providerId}")
    public void updateProvider(@PathVariable("providerId") Long providerId,
                               @RequestParam(required = false) String name){
        providerService.updateProvider(providerId, name );
    }

}
