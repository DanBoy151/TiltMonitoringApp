package com.api.repository;

import java.util.List;

import com.api.model.Hydrometer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("HydrometerRepository")
@EntityScan(basePackageClasses = Hydrometer.class)
public interface HydrometerRepository extends CrudRepository<Hydrometer, Long>{
    Hydrometer findByColour(String colour);
    List<Hydrometer> findAll();
    Hydrometer findByHydrometerID(long hydrometerID);
}