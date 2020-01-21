package com.api.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.api.model.Sample;

@Component("SampleRepository")
@EntityScan(basePackageClasses = Sample.class)
public interface SampleRepository extends CrudRepository<Sample, Long>{
    List<Sample> findAll();
    Sample findById(long id);
}