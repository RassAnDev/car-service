package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.clients.ClientsOrganizationsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class ClientsOrganizationsService {
    @Autowired
    private ClientsOrganizationsRepository repo;

    public List<ClientsOrganizations> listAll() {
        return repo.findAll();
    }

    public void save(ClientsOrganizations clientsOrganizations) {
        repo.save(clientsOrganizations);
    }

    public ClientsOrganizations get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
