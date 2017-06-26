package com.bluexiii.microservice.util;

import com.bluexiii.microservice.exception.DataFormatException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by bluexiii on 25/06/2017.
 */
public class StringUtilsTest {

    @Test
    public void dateToStr() throws Exception {
        String str = StringUtils.dateToStr(new Date());
        assertNotNull(str);

        str = StringUtils.dateToStr(null);
        assertTrue(str.equals(""));
    }

    @Test
    public void strToDate() throws Exception {
        Date date = StringUtils.strToDate("2010-1-1 10:10:10");
        Assert.assertNotNull(date);

        try {
            date = null;
            date = StringUtils.strToDate("20100101");
        } catch (DataFormatException e) {
            // do nothing
        }
        assertNull(date);
    }

}