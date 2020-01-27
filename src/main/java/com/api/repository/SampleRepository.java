package com.api.repository;

import java.util.List;

import com.api.model.Sample;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("SampleRepository")
@EntityScan(basePackageClasses = Sample.class)
public interface SampleRepository extends CrudRepository<Sample, Long>{
    List<Sample> findAll();
    Sample findBySampleID(long sampleID);
}