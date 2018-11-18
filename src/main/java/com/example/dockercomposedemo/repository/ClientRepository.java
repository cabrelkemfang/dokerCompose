package com.example.dockercomposedemo.repository;

import com.example.dockercomposedemo.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long >{
}
