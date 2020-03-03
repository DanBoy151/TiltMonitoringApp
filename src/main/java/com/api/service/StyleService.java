package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Style;
import com.api.repository.StyleRepository;
import java.util.List;

@Component("StyleService")
public class StyleService {

    @Autowired
    private StyleRepository styleRepository;


    //Create
    public boolean createStyle(Style style){
        styleRepository.save(style);
        return true;
    }

    //Retrieve
    public Style retrieveStyle(long id){
        return styleRepository.findByStyleID(id);
    }

    //Retrieve All
    public List<Style> retrieveAllStyles(){
        return styleRepository.findAll();
    }

    //Update
    public boolean updateStyle(Style style){
        styleRepository.save(style);
        return true;
    }

    //Delete
    public boolean deleteStyle(long id){
        styleRepository.deleteById(id);
        return true;
    }
}
