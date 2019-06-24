package org;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.redhat.Invoice;
import org.redhat.InvoiceService;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest

public class NoSuchMethodTest {

    @Inject
    InvoiceService service;

    private File invoicePDF;
    private Invoice invoice;

    @BeforeEach
    public void setup() throws IOException {
        invoice = TestUtils.sampleInvoice();

    }


    @Test
    public void testNoSuchMethodError() {

        Invoice invoice = service.parse();

    }

}