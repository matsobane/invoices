package com.eohdigital.invoices;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
    private String client;
    private Long vatRate;
    private Date invoiceDate;
    @OneToMany(fetch = FetchType.EAGER,targetEntity = LineItem.class,cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "invoice_id")
    private List<LineItem> lineItems = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(Long id, String client, Long vatRate, Date invoiceDate, List<LineItem> lineItems) {
        this.id = id;
        this.client = client;
        this.vatRate = vatRate;
        this.invoiceDate = invoiceDate;
        this.lineItems = lineItems;
    }

    public BigDecimal getVat() {

        return getSubTotal().multiply(new BigDecimal(vatRate)).setScale(2,RoundingMode.HALF_UP);
    }

    public BigDecimal getSubTotal() {
        BigDecimal subTotal = new BigDecimal("0");
        for (LineItem li:lineItems) {
            subTotal = subTotal.add(li.getLineItemTotal()).setScale(2,RoundingMode.HALF_UP);
        }
        return subTotal;
    }

    public BigDecimal getTotal(){
        return getSubTotal().add(getVat()).setScale(2,RoundingMode.HALF_UP);
    }

    public void addLineItem(LineItem lineItem){
        if(lineItem==null) throw new IllegalArgumentException("LineItem cannot be null");
        if(this.getLineItems()==null) this.lineItems = new ArrayList<>();
        this.lineItems.add(lineItem);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getVatRate() {
        return vatRate;
    }

    public void setVatRate(Long vatRate) {
        this.vatRate = vatRate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}
