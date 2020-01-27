package com.api.repository;

import java.util.List;

import com.api.model.Bottle;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("BottleRepository")
@EntityScan(basePackageClasses = Bottle.class)
public interface BottleRepository extends CrudRepository<Bottle, Long>{
    List<Bottle> findAll();
    Bottle findByBottleID(long bottleID);
}