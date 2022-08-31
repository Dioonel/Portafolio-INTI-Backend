package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Education;

import java.util.List;

public interface EducationService {
    public List<Education> getAllEducation();
    public Education getOneEducation(int id);
    public Education addEducation(Education education);
    public void deleteEducation(int id);
    public Education updateEducation(int id, Education education);
}
