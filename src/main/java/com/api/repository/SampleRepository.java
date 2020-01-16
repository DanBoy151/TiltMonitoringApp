package com.api.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.api.model.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long>{
    List<Sample> findAll();
    Sample findById(long id);
}