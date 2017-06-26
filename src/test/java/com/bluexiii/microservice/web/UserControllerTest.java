package com.bluexiii.microservice.web;

import com.bluexiii.microservice.domain.TfFUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void findUserById() {
        ResponseEntity<TfFUser> result = restTemplate.getForEntity("/foo/bar/users/1715043034165359", TfFUser.class);
        logger.info(result.toString());
        Assert.assertEquals(result.getBody().getSerialNumber(), "18612341234");
    }

    @Test
    public void findUserByNumber() {
        ResponseEntity<TfFUser> result = restTemplate.getForEntity("/foo/bar/users?serialNumber=18612341234", TfFUser.class);
        logger.info(result.toString());
        Assert.assertEquals(result.getBody().getSerialNumber(), "18612341234");
    }
}
