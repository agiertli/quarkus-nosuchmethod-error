package org;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;

/**
 * RepositoryTest
 */
@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class RepositoryTest {

    @Test
    public void test(){

    }

    
}