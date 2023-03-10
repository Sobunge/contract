package com.pensasha.contract.client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>{

    public Boolean existsByName(String name);
    
}
