package com.portafolio.backend.portafolio.services;

import com.portafolio.backend.portafolio.models.Skill;

import java.util.List;

public interface SkillService {
    public List<Skill> getAllSkills();
    public Skill getOneSkill(int id);
    public Skill addSkill(Skill skill);
    public void deleteSkill(int id);
    public Skill updateSkill(int id, Skill skill);
}
