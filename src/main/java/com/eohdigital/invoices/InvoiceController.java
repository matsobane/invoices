package com.eohdigital.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addInvoice(@RequestBody Invoice invoice){
        Invoice saved = this.invoiceRepository.save(invoice);
    }

    @GetMapping
    public List<Invoice> viewAllInvoices(){
        List<Invoice> invoices = invoiceRepository.findAll();
        return invoices;
    }

    @GetMapping("/{invoiceId}")
    public Invoice viewInvoice(@PathVariable Long invoiceId){
        return invoiceRepository.findById(invoiceId).get();
    }
}
