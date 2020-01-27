package com.api.repository;

import java.util.List;

import com.api.model.Note;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("NoteRepository")
@EntityScan(basePackageClasses = Note.class)
public interface NoteRepository extends CrudRepository<Note, Long>{
    List<Note> findAll();
    Note findByNoteID(long noteID);
}