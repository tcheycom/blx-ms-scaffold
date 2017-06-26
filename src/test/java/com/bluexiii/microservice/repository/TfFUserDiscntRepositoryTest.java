package com.bluexiii.microservice.repository;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import com.bluexiii.microservice.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bluexiii on 21/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TfFUserDiscntRepositoryTest {
    @Autowired
    private TfFUserDiscntRepository tfFUserDiscntRepository;
    private static final Logger logger = LoggerFactory.getLogger(TfFUserDiscntRepositoryTest.class);

    @Test
    public void findTfFUserDiscntTest1() {
        TfFUserDiscnt one = tfFUserDiscntRepository.findOne(1715043069438519L);
        logger.info(one.toString());
        assertNotNull(one);
    }

    @Test
    public void findTfFUserDiscntTest2() {
        List<TfFUserDiscnt> list = tfFUserDiscntRepository.findByUserId(1715043034165359L);
        logger.info(list.toString());
        assertNotNull(list);
    }

    @Test
    public void updateTfFUserDiscntTest1() {
        TfFUserDiscnt one = tfFUserDiscntRepository.findOne(1715043069438519L);
        one.setEndDate(StringUtils.strToDate("2018-1-1 11:11:11"));
        tfFUserDiscntRepository.save(one);
        assertNotNull(one);
    }
}