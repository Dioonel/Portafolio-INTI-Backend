package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Skill;
import com.portafolio.backend.portafolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImplementation implements SkillService{
    @Autowired
    private SkillRepository skillRepo;


    @Override
    public List<Skill> getAllSkills() {
        return skillRepo.findAllByOrderByIdAsc();
    }

    @Override
    public Skill getOneSkill(int id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill updateSkill(int id, Skill updatedSkill) {
        return skillRepo.findById(id).map(user -> {
            user.setSkill(updatedSkill.getSkill());
            user.setValue(updatedSkill.getValue());
            return skillRepo.save(user);
        }).get();
    }
}
