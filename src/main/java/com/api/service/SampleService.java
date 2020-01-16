package com.api.service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Sample;
import com.api.repository.SampleRepository;

@Component("SampleService")
public class SampleService{

    private final AtomicLong sampleID = new AtomicLong();
    private final AtomicLong noteID = new AtomicLong();
    private final AtomicLong imageID = new AtomicLong();

    @Autowired
    private SampleRepository sampleRepository;

    //Create
    public boolean createSample(Sample sample){
        sample.setSampleID(sampleID.incrementAndGet());
        sample.setNoteID(noteID.incrementAndGet());
        sample.setImageID(imageID.incrementAndGet());

        sampleRepository.save(sample);

        return true;
    }

    //Retrieve
    public Sample retrieveSample(long sampleID){
        return sampleRepository.findById(sampleID);
    }

    //Update
    public boolean updateSample(Sample sample){
        sampleRepository.save(sample);
        return true;
    }

    //Delete
    public boolean deleteSample(long sampleID){
        sampleRepository.deleteById(sampleID);
        return true;
    }

}