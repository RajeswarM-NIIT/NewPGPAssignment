package com.test.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.configuration.DBConfig;
import com.test.dao.FacultyDAOInt;
import com.test.dao.SkillDAOInt;
import com.test.model.Faculty;
import com.test.model.Skill;

public class AppMainSkill {	
	public static void main(String[] args) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		 SkillDAOInt skilldao = ctx.getBean(SkillDAOInt.class);
		 
		 Skill skill = new Skill("Visual Basic");
		 skilldao.addSkill(skill);
		 
		 List<Skill> skills = skilldao.getAllSkills();
		 System.out.println(skills);
		 
		 
	}
}
