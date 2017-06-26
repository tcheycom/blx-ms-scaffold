package com.bluexiii.microservice.handler;

import com.bluexiii.microservice.exception.AlreadyExistsException;
import com.bluexiii.microservice.exception.BusinessException;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import com.netflix.hystrix.exception.HystrixRuntimeException;
import com.bluexiii.microservice.dto.ApiError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 异常处理
 * Created by bluexiii on 16/9/6.
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND) //404 Not Found 未找到
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseBody
    public ApiError handleRunTimeException(ResourceNotFoundException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }

    @ResponseStatus(HttpStatus.CONFLICT) //409 Conflict 已存在
    @ExceptionHandler(AlreadyExistsException.class)
    @ResponseBody
    public ApiError handleRunTimeException(AlreadyExistsException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.CONFLICT.value(), HttpStatus.CONFLICT.value(), ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //400 Bad Request 801 SQL异常
    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseBody
    public ApiError handleRunTimeException(DataIntegrityViolationException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.BAD_REQUEST.value(), 801, "SQL执行异常", ex.getMessage(), null);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //400 Bad Request 802 通用业务逻辑异常
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public ApiError handleRunTimeException(HttpMessageNotReadableException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.BAD_REQUEST.value(), 802, "请求参数无法识别", ex.getMessage(), null);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST) //400 Bad Request ??? 通用业务逻辑异常
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ApiError handleRunTimeException(BusinessException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.BAD_REQUEST.value(), ex.getCode(), ex.getMessage());
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST) //423 Locked 423 Hystrix融断异常
    @ExceptionHandler(HystrixRuntimeException.class)
    @ResponseBody
    public ApiError handleRunTimeException(HystrixRuntimeException ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.LOCKED.value(), 423, ex.getMessage());
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //500 Internal Server Error 其它异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiError handleRunTimeException(Exception ex) {
        logger.error(ex.getMessage());
        return new ApiError(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

}