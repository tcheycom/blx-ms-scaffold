package com.bluexiii.microservice.service;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import com.bluexiii.microservice.exception.AlreadyExistsException;
import com.bluexiii.microservice.exception.DataFormatException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.bluexiii.microservice.repository.ProcedureRepository;
import com.bluexiii.microservice.repository.TfFUserDiscntRepository;
import com.bluexiii.microservice.exception.BusinessException;
import com.bluexiii.microservice.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
@Transactional
public class DiscntService {
    @Autowired
    private TfFUserDiscntRepository tfFUserDiscntRepository;
    @Autowired
    private ProcedureRepository procedureRepository;

    /**
     * 按ITEM_ID查询资费
     *
     * @param itemId
     * @return
     */
    @HystrixCommand(
            groupKey = "ms-scaffold",
            commandKey = "findDiscntByItemId",
            threadPoolKey = "findDiscntByItemId",
            fallbackMethod = "",  //交ControllerExceptionHandler处理
            ignoreExceptions = {BusinessException.class, ResourceNotFoundException.class, AlreadyExistsException.class, DataFormatException.class}
    )
    public TfFUserDiscnt findDiscntByItemId(Long itemId) {
        TfFUserDiscnt discnt = tfFUserDiscntRepository.findOne(itemId);
        if (discnt == null) {
            throw new ResourceNotFoundException(String.format("不存在 id=%s", itemId));
        }
        return discnt;
    }

    /**
     * 按USER_ID查询资费
     *
     * @param userId
     * @return
     */
    @HystrixCommand(
            groupKey = "ms-scaffold",
            commandKey = "findDiscntsByUserId",
            threadPoolKey = "findDiscntsByUserId",
            fallbackMethod = "",  //交ControllerExceptionHandler处理
            ignoreExceptions = {BusinessException.class, ResourceNotFoundException.class, AlreadyExistsException.class, DataFormatException.class}
    )
    public List<TfFUserDiscnt> findDiscntsByUserId(Long userId) {
        List<TfFUserDiscnt> list = tfFUserDiscntRepository.findByUserId(userId);
        if (list.isEmpty()) {
            throw new ResourceNotFoundException(String.format("没有找到 userId=%s", userId));
        }
        return list;
    }

    /**
     * 按ITEM_ID修改资费
     *
     * @param itemId
     * @param discnt
     */
    @HystrixCommand(
            groupKey = "ms-scaffold",
            commandKey = "updateDiscntByItemId",
            threadPoolKey = "updateDiscntByItemId",
            fallbackMethod = "",  //交ControllerExceptionHandler处理
            ignoreExceptions = {BusinessException.class, ResourceNotFoundException.class, AlreadyExistsException.class, DataFormatException.class}
    )
    public void updateDiscntByItemId(Long itemId, TfFUserDiscnt discnt) {
        TfFUserDiscnt existing = tfFUserDiscntRepository.findOne(itemId);
        if (existing == null) {
            throw new ResourceNotFoundException("对像不存在");
        }

        // 限定仅修改起止时间
        Date startDate = discnt.getStartDate();
        Date endDate = discnt.getEndDate();
        if (startDate != null) {
            existing.setStartDate(startDate);
        }
        if (endDate != null) {
            existing.setEndDate(endDate);
        }

        tfFUserDiscntRepository.save(existing);

        // 同步计费
        long userId = existing.getUserId();
        procedureRepository.crmToBilling(",8,", userId);
    }

}
