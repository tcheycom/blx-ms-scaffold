package com.bluexiii.microservice.repository;

import com.bluexiii.microservice.domain.TfFUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by bluexiii on 21/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TfFUserRepositoryTest {
    @Autowired
    private TfFUserRepository tfFUserRepository;
    private static final Logger logger = LoggerFactory.getLogger(TfFUserRepositoryTest.class);

    @Test
    public void findTfFUserTest1() {
        TfFUser user = tfFUserRepository.findOne(1715043034165359L);
        logger.info(user.toString());
        assertNotNull(user);
    }

    @Test
    public void findTfFUserTest2() {
        TfFUser user = tfFUserRepository.findOneBySerialNumberAndRemoveTag("18612341234", "0");
        logger.info(user.toString());
        assertNotNull(user);
    }

}