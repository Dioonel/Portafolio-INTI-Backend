package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.models.Education;
import com.portafolio.backend.portafolio.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private EducationService educationService;

    @GetMapping
    public List<Education> getEducation(){
        return educationService.getAllEducation();
    }

    @GetMapping("/{id}")
    public Education getEducationById(@PathVariable int id){
        return educationService.getOneEducation(id);
    }

    @PostMapping
    public Education createEducation(@RequestBody Education education){
        return educationService.addEducation(education);
    }

    @DeleteMapping("/{id}")
    public void deleteEducation(@PathVariable int id){
        educationService.deleteEducation(id);
    }

    @PutMapping("/{id}")
    public Education updateEducation(@PathVariable int id, @RequestBody Education updatedEducation){
        return educationService.updateEducation(id, updatedEducation);
    }
}
