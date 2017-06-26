package com.bluexiii.microservice.service;

import com.bluexiii.microservice.domain.TfFUser;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by bluexiii on 24/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    UserService userService;

    @Test
    public void findUserBySerialNumber() throws Exception {
        TfFUser user = userService.findUserBySerialNumber("18612341234");
        logger.info(user.toString());
        Assert.assertNotNull(user);

        try{
            userService.findUserBySerialNumber("1");
        } catch (ResourceNotFoundException ex) {
            assertTrue(true);
        }
    }


    @Test
    public void findUserById() throws Exception {
        TfFUser user = userService.findUserById(1715043034165359L);
        logger.info(user.toString());
        Assert.assertNotNull(user);

        try{
            userService.findUserById(1L);
        } catch (ResourceNotFoundException ex) {
            assertTrue(true);
        }
    }
}