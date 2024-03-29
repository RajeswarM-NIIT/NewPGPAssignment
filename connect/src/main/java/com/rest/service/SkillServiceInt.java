package com.rest.service;

import java.util.List;

import com.test.model.Skill;

public interface SkillServiceInt {
	public abstract boolean addSkill(Skill skill);
	public List<Skill> getAllSkills();
	public Skill getSkillById(String skillid);
	public List<Skill> getSkillByName(String skillname);
	public boolean deleteSkill(String skillid);
	public boolean updateSkill(Skill skill);
}
