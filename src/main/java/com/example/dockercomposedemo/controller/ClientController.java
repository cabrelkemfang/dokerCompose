package com.example.dockercomposedemo.controller;

import com.example.dockercomposedemo.domain.Client;
import com.example.dockercomposedemo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

  @Autowired
  private ClientRepository clientRepository;

  @RequestMapping(value = "/test",method = RequestMethod.GET)
  public ResponseEntity<List<Client>> getAllClient(){
    List<Client> clientList=this.clientRepository.findAll();
    return new ResponseEntity<>(clientList, HttpStatus.OK);
  }

  @RequestMapping(value = "/test",method = RequestMethod.POST)
  public void  saveClient(@RequestBody Client client){
    this.clientRepository.save(client);
  }

}
