package com.bluexiii.microservice.dto;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by bluexiii on 25/05/2017.
 */
@SpringBootTest
public class ApiErrorTest {

    @Test
    public void createApiError() throws Exception {
        ApiError apiError1 = new ApiError(0, 0, "message");
        ApiError apiError2 = new ApiError(0, 0, "message", "devMessage", "moreInfo");

        apiError2.setCode(0);
        apiError2.setMessage("message");
        apiError2.setDeveloperMessage("devMessage");
        apiError2.setMoreInfo("moreInfo");
        apiError2.setStatus(1);

        apiError2.getCode();
        apiError2.getMessage();
        apiError2.getDeveloperMessage();
        apiError2.getMoreInfo();
        apiError2.getStatus();
    }
}