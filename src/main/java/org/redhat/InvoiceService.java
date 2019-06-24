package org.redhat;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvoiceService implements InvoiceServiceI {

    public InvoiceService() {
    }

    public Invoice parse() {

        Invoice invoice = extractMetadata();
        return invoice;
    }

    public Invoice extractMetadata(){

        Invoice invoice = new Invoice();
        invoice.accountId = "something";
        return invoice;
    }

}