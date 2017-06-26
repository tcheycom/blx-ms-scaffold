package com.bluexiii.microservice.repository;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bluexiii on 21/06/2017.
 */
public interface TfFUserDiscntRepository extends JpaRepository<TfFUserDiscnt, Long> {
    public List<TfFUserDiscnt> findByUserId(Long userId);
}
