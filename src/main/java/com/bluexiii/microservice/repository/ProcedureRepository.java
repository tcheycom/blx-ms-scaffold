package com.bluexiii.microservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by bluexiii on 23/06/2017.
 */
@Repository
public class ProcedureRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void crmToBilling(String syncStr, Long userId) {
        jdbcTemplate.update("call JC_HL_LITJ31.P_CTB_STC(?, ?, ?, ?)", syncStr, userId.toString(), "", "");
    }
}
