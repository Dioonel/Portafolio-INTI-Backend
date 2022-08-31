package com.portafolio.backend.portafolio.controllers;

import com.portafolio.backend.portafolio.models.Skill;
import com.portafolio.backend.portafolio.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> getSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Skill getSkillById(@PathVariable int id){
        return skillService.getOneSkill(id);
    }

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill){
        return skillService.addSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable int id){
        skillService.deleteSkill(id);
    }

    @PutMapping("/{id}")
    public Skill updateSkill(@PathVariable int id, @RequestBody Skill updatedSkill){
        return skillService.updateSkill(id, updatedSkill);
    }
}
