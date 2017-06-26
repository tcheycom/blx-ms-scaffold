package com.bluexiii.microservice.exception;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by bluexiii on 25/05/2017.
 */
@SpringBootTest
public class ResourceNotFoundExceptionTest {
    @Test
    public void createException() {
        ResourceNotFoundException resourceNotFoundException = new ResourceNotFoundException("message");
    }
}