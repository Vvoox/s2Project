package com.example.testx.others.service;

import com.example.testx.others.service.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class ClientService {

    private int clientcountid = 1;
    private List<Client> clientList = new CopyOnWriteArrayList<>();


    public Client addClient(Client client){

        client.setClientID(clientcountid);

        clientList.add(client);
        clientcountid++;

        return client;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public Client getClient(int clientid){

        return clientList
                .stream()
                .filter(c -> c.getClientID() == clientid)
                .findFirst()
                .get();
    }

    public void deleteClient(int clientid){

        clientList
                .stream()
                .forEach(c -> {
                    if(c.getClientID() == clientid){
                        clientList.remove(c);
                    }
                });


    }
}
