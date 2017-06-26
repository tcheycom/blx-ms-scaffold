package com.bluexiii.microservice.handler;

import com.bluexiii.microservice.exception.AlreadyExistsException;
import com.bluexiii.microservice.exception.DataFormatException;
import com.bluexiii.microservice.exception.BusinessException;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import org.junit.Test;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.converter.HttpMessageNotReadableException;

/**
 * Created by bluexiii on 25/05/2017.
 */
public class ControllerExceptionHandlerTest {
    @Test
    public void handleRunTimeException1() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new Exception());

    }

    @Test
    public void handleRunTimeException2() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new RuntimeException());

    }

    @Test
    public void handleRunTimeException3() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new AlreadyExistsException("message"));

    }

    @Test
    public void handleRunTimeException4() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new BusinessException(0, "message"));

    }

    @Test
    public void handleRunTimeException5() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new ResourceNotFoundException("message"));

    }

    @Test
    public void handleRunTimeException6() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new DataFormatException("message"));

    }

    @Test
    public void handleRunTimeException7() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new HttpMessageNotReadableException("message"));

    }

    @Test
    public void handleRunTimeException8() throws Exception {
        ControllerExceptionHandler controllerExceptionHandler = new ControllerExceptionHandler();
        controllerExceptionHandler.handleRunTimeException(new DataIntegrityViolationException("message"));
    }
}