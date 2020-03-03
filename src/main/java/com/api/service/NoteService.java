package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Note;
import com.api.repository.NoteRepository;

@Component("NoteService")
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;


    //Create
    public boolean createNote(Note note){
        noteRepository.save(note);
        return true;
    }

    //Retrieve
    public Note retrieveNote(long id){
        return noteRepository.findByNoteID(id);
    }

    //Update
    public boolean updateNote(Note note){
        noteRepository.save(note);
        return true;
    }

    //Delete
    public boolean deleteNote(long id){
        noteRepository.deleteById(id);
        return true;
    }

}
