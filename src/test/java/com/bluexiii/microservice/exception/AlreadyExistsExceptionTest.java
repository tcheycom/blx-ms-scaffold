package com.bluexiii.microservice.exception;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by bluexiii on 25/05/2017.
 */
@SpringBootTest
public class AlreadyExistsExceptionTest {

    @Test
    public void createException() {
        AlreadyExistsException alreadyExistsException = new AlreadyExistsException("message");
    }
}