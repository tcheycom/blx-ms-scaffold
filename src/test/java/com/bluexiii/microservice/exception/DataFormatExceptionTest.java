package com.bluexiii.microservice.exception;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by bluexiii on 25/05/2017.
 */
@SpringBootTest
public class DataFormatExceptionTest {
    @Test
    public void createException() {
        DataFormatException dataFormatException = new DataFormatException("message");
    }
}