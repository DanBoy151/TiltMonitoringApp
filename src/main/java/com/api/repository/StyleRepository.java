package com.api.repository;

import java.util.List;

import com.api.model.Style;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("StyleRepository")
@EntityScan(basePackageClasses = Style.class)
public interface StyleRepository extends CrudRepository<Style, Long>{
    List<Style> findAll();
    Style findByStyleID(long styleID);
}