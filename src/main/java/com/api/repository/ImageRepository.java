package com.api.repository;

import java.util.List;

import com.api.model.Image;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("ImageRepository")
@EntityScan(basePackageClasses = Image.class)
public interface ImageRepository extends CrudRepository<Image, Long>{
    List<Image> findAll();
    Image findByImageID(long imageID);
}