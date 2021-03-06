package org.carservice.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.documents.InvoicesForPaymentsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class InvoicesForPaymentsService {
    @Autowired
    private InvoicesForPaymentsRepository repo;

    public List<InvoicesForPayments> listAll() {
        return repo.findAll();
    }

    public void save(InvoicesForPayments invoicesForPayments) {
        repo.save(invoicesForPayments);
    }

    public InvoicesForPayments get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
