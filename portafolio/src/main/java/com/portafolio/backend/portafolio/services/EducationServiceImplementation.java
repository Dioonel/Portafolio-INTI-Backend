package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Education;
import com.portafolio.backend.portafolio.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImplementation implements EducationService{
    @Autowired
    private EducationRepository educationRepo;


    @Override
    public List<Education> getAllEducation() {
        return educationRepo.findAll();
    }

    @Override
    public Education getOneEducation(int id) {
        return educationRepo.findById(id).orElse(null);
    }

    @Override
    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }

    @Override
    public void deleteEducation(int id) {
        educationRepo.deleteById(id);
    }

    @Override
    public Education updateEducation(int id, Education updatedEducation) {
        return educationRepo.findById(id).map(education -> {
            education.setTitle(updatedEducation.getTitle());
            education.setIcon(updatedEducation.getIcon());
            education.setDate(updatedEducation.getDate());
            return educationRepo.save(education);
        }).get();
    }
}
