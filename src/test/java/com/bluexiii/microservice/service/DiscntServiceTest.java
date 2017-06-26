package com.bluexiii.microservice.service;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import com.bluexiii.microservice.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by bluexiii on 07/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscntServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(DiscntServiceTest.class);
    @Autowired
    DiscntService discntService;

    @Test
    public void findDiscntByItemId() throws Exception {
        TfFUserDiscnt discnt = discntService.findDiscntByItemId(1715043069438519L);
        logger.info(discnt.toString());
        assertNotNull(discnt);

        try{
            discntService.findDiscntByItemId(1L);
        } catch (ResourceNotFoundException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void findDiscntsByUserId() throws Exception {
        List<TfFUserDiscnt> discnts = discntService.findDiscntsByUserId(1715043034165359L);
        logger.info(discnts.toString());
        assertNotNull(discnts);

        try{
            discntService.findDiscntsByUserId(1L);
        } catch (ResourceNotFoundException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void updateDiscntByItemId() throws Exception {
        TfFUserDiscnt discnt = discntService.findDiscntByItemId(1715043069438519L);
        discnt.setEndDate(StringUtils.strToDate("2018-1-1 11:11:11"));
        logger.info(discnt.getItemId().toString());
        discntService.updateDiscntByItemId(1715043069438519L, discnt);

        try{
            discntService.updateDiscntByItemId(1L, discnt);
        } catch (ResourceNotFoundException ex) {
            assertTrue(true);
        }
    }

}