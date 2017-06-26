package com.bluexiii.microservice.exception;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by bluexiii on 25/05/2017.
 */
@SpringBootTest
public class BusinessExceptionTest {

    @Test
    public void createException() {
        BusinessException businessException = new BusinessException(400, "message");
    }


}