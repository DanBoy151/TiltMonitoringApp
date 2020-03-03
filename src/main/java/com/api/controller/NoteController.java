package com.api.controller;

import com.api.model.Beer;
import com.api.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.api.service.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    //Get Beer by ID
    @GetMapping("/{id}")
    public @ResponseBody
    Note getNote(@PathVariable("id") long id){
        return noteService.retrieveNote(id);
    }

    //Create New Beer
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newNote(@RequestBody Note newNote){
        noteService.createNote(newNote);
    }

    //Update a Specific Beer
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void putNote(@PathVariable("id") long id, @RequestBody Note updateNote){
        noteService.updateNote(updateNote);
    }

    //Delete a Beer by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNote(@PathVariable("id") long id){
        noteService.deleteNote(id);
    }

}