package com.bluexiii.microservice.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bluexiii on 25/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RootControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(RootControllerTest.class);


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void rootRedirect() throws Exception {
        Object execute = restTemplate.execute("/foo/bar", HttpMethod.GET, null, null, null, null);
    }

}