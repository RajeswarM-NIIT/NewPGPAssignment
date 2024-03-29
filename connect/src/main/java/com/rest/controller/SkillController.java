package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.service.SkillServiceInt;
import com.test.model.Skill;

@RestController
public class SkillController {
	@Autowired
	private SkillServiceInt skillservice;
	
	@RequestMapping(value="/addSkill", method=RequestMethod.POST)
	public ResponseEntity<?> addSkill(@RequestBody Skill skill){
		System.out.print("\nSkillController - addSkill");
		boolean res=skillservice.addSkill(skill);
		if(res==true) {		
			return new ResponseEntity<Skill>(skill,HttpStatus.OK);	
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Adding Skill record failed"),HttpStatus.CONFLICT);
		}
	}	
	
	@RequestMapping(value="/getAllSkills", method=RequestMethod.GET)
	public ResponseEntity<?> getAllSkills(){
		System.out.print("\nSkillController - getAllSkills");
		List<Skill> skills = skillservice.getAllSkills();
		if(skills.size()>0) {
			return new ResponseEntity<List<Skill>>(skills,HttpStatus.OK);	
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","No records found"),HttpStatus.NOT_FOUND);
		}
			
	}	

	@RequestMapping(value="/getSkillById", method=RequestMethod.GET)
	public ResponseEntity<?> getSkillById(@RequestParam("skillid")String skillid){
		System.out.print("\nSkillController - getSkillById");
		Skill skill = skillservice.getSkillById(skillid);
		if(skill!=null) {
			return new ResponseEntity<Skill>(skill,HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","Skill Not Found"),HttpStatus.NOT_FOUND);		
		}
	}	

	@RequestMapping(value="/getSkillByName", method=RequestMethod.GET)
	public ResponseEntity<?> getSkillByName(@RequestParam("skillname")String skillname){
		System.out.print("\nSkillController - getSkillByName");
		List<Skill> skills =skillservice.getSkillByName(skillname);
		if(skills.size()>0) {
			return new ResponseEntity<List<Skill>>(skills,HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","Skill Not Found"),HttpStatus.NOT_FOUND);		
		}	
	}
	
	@RequestMapping(value="/updateSkill", method=RequestMethod.PUT)
	public ResponseEntity<Message> updateSkill(@RequestBody Skill skill){
		System.out.print("\nSkillController - updateSkill");
		boolean result=false;
		result = skillservice.updateSkill(skill);
		if(result==true) {
			return new ResponseEntity<Message>(new Message("INF","Skill info updated successfully"),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Skill updation failed"),HttpStatus.OK);
		}
				
	}
	
	@RequestMapping(value="/deleteSkill", method=RequestMethod.DELETE)
	public ResponseEntity<Message> deleteSkill(@RequestParam("skillid")String skillid){
		System.out.print("\nSkillController - deleteSkill");
		boolean result=false;
		result = skillservice.deleteSkill(skillid);
		if(result==true) {
			return new ResponseEntity<Message>(new Message("INF","Skill record deleted successfully"),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Skill deletion failed"),HttpStatus.OK);
		}
				
	}
	
}
