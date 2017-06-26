package com.bluexiii.microservice.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bluexiii on 23/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcedureRepositoryTest {
    private static final Logger logger = LoggerFactory.getLogger(ProcedureRepositoryTest.class);

    @Autowired
    private ProcedureRepository procedureRepository;


    @Test
    public void crmToBilling() throws Exception {
        procedureRepository.crmToBilling(",8,", 1715043034165359L);
    }

}