package com.bluexiii.microservice.web;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import com.bluexiii.microservice.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by bluexiii on 07/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DiscntControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(DiscntControllerTest.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void findDiscntByItemId() throws Exception {
        ResponseEntity<TfFUserDiscnt> result = restTemplate.getForEntity("/foo/bar/discnts/1715043069438519", TfFUserDiscnt.class);
        logger.info(result.toString());
        Assert.assertEquals(result.getBody().getItemId(), new Long(1715043069438519L));
    }

    @Test
    public void findDiscntsByUserId() throws Exception {
        ResponseEntity<List> result = restTemplate.getForEntity("/foo/bar/discnts?userId=1715043034165359", List.class);
        logger.info(result.toString());
        Assert.assertEquals(((Map) result.getBody().get(0)).get("userId"), 1715043034165359L);
    }

    @Test
    public void updateDiscntByItemId() throws Exception {
        TfFUserDiscnt discnt = new TfFUserDiscnt();
        discnt.setItemId(1715043069438519L);
        discnt.setEndDate(StringUtils.strToDate("2017-8-1 21:01:02"));
        restTemplate.put("/foo/bar/discnts/1715043069438519", discnt);
    }
}