package com.bluexiii.microservice.repository;

import com.bluexiii.microservice.domain.TfFUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bluexiii on 21/06/2017.
 */
public interface TfFUserRepository extends JpaRepository<TfFUser, Long> {
    public TfFUser findOneBySerialNumberAndRemoveTag(String serialNumber,String removeTag);
}
