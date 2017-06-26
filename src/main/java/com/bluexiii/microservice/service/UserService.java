package com.bluexiii.microservice.service;

import com.bluexiii.microservice.exception.AlreadyExistsException;
import com.bluexiii.microservice.exception.DataFormatException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.bluexiii.microservice.repository.TfFUserRepository;
import com.bluexiii.microservice.domain.TfFUser;
import com.bluexiii.microservice.exception.BusinessException;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {
    @Autowired
    private TfFUserRepository tfFUserRepository;

    /**
     * 按号码查询用户
     *
     * @param serialNumber
     * @return
     */
    @HystrixCommand(
            groupKey = "ms-scaffold",
            commandKey = "findUserBySerialNumber",
            threadPoolKey = "findUserBySerialNumber",
            fallbackMethod = "",
            ignoreExceptions = {BusinessException.class, ResourceNotFoundException.class, AlreadyExistsException.class, DataFormatException.class}
    )
    public TfFUser findUserBySerialNumber(String serialNumber) {
        TfFUser user = tfFUserRepository.findOneBySerialNumberAndRemoveTag(serialNumber, "0");
        if (user == null) {
            throw new ResourceNotFoundException(String.format("不存在 serialNumber=%s", serialNumber));
        }
        return user;
    }

    /**
     * 按ID查询用户
     *
     * @param id
     * @return
     */
    @HystrixCommand(
            groupKey = "ms-scaffold",
            commandKey = "findUserById",
            threadPoolKey = "findUserById",
            fallbackMethod = "",
            ignoreExceptions = {BusinessException.class, ResourceNotFoundException.class, AlreadyExistsException.class, DataFormatException.class}
    )
    public TfFUser findUserById(Long id) {
        TfFUser user = tfFUserRepository.findOne(id);
        if (user == null) {
            throw new ResourceNotFoundException(String.format("不存在 id=%s", id));
        }
        return user;
    }
}
