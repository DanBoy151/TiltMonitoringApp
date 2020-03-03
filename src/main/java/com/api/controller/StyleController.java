package com.api.controller;

import com.api.model.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.api.service.*;

import java.util.List;

@RestController
@RequestMapping("/styles")
public class StyleController {
    @Autowired
    private StyleService styleService;

    //Get Beer by ID
    @GetMapping("")
    public @ResponseBody
    List<Style> getStyles(){
        return styleService.retrieveAllStyles();
    }

    //Get Beer by ID
    @GetMapping("/{id}")
    public @ResponseBody
    Style getStyle(@PathVariable("id") long id){
        return styleService.retrieveStyle(id);
    }

    //Create New Beer
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newStyle(@RequestBody Style newStyle){
        styleService.createStyle(newStyle);
    }

    //Update a Specific Beer
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void putStyle(@PathVariable("id") long id, @RequestBody Style updateStyle){
        styleService.updateStyle(updateStyle);
    }

    //Delete a Beer by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStyle(@PathVariable("id") long id){
        styleService.deleteStyle(id);
    }

}
