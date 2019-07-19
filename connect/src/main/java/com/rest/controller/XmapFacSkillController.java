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

import com.rest.service.XmapFacSkillServiceInt;
import com.test.model.Xmap_Fac_Skill;

@RestController
public class XmapFacSkillController {
	@Autowired
	private XmapFacSkillServiceInt xmapservice;
	
	@RequestMapping(value="/getAllXmapFs", method=RequestMethod.GET)
	public ResponseEntity<?> getAllXmapFacSkill(){
		System.out.print("\nXmapFacSkillController - getAllXmapFs");
		List<Xmap_Fac_Skill> xfss = xmapservice.getAllXfs();
		if(xfss.size()>0) {
			return new ResponseEntity<List<Xmap_Fac_Skill>>(xfss,HttpStatus.FOUND);	
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","No records found"),HttpStatus.NOT_FOUND);
		}			
	}	
	
	@RequestMapping(value="/getAllXmapFsById", method=RequestMethod.GET)
	public ResponseEntity<?> getAllXmapFsById(@RequestParam("xfsid")String xfsid){
		System.out.print("\nXmapFacSkillController - getAllXmapFsById");
		Xmap_Fac_Skill xfs = xmapservice.getXfsById(xfsid);
		if(xfs!=null) {
			return new ResponseEntity<Xmap_Fac_Skill>(xfs,HttpStatus.FOUND);	
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","No records found"),HttpStatus.NOT_FOUND);
		}			
	}
	
	@RequestMapping(value="/getAllXmapFsByFacultyId", method=RequestMethod.GET)
	public ResponseEntity<?> getAllXmapFsByFacultyId(@RequestParam("facid")String facid){
		System.out.print("\nXmapFacSkillController - getAllXmapFsByFacultyId");
		List<Xmap_Fac_Skill> xfss = xmapservice.getAllXfsByFacultyId(facid);
		if(xfss.size()>0) {
			return new ResponseEntity<List<Xmap_Fac_Skill>>(xfss,HttpStatus.FOUND);	
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","No records found"),HttpStatus.NOT_FOUND);
		}			
	}
	
	@RequestMapping(value="/getAllXmapFsBySkillId", method=RequestMethod.GET)
	public ResponseEntity<?> getAllXmapFsBySkillId(@RequestParam("skillid")String skillid){
		System.out.print("\nXmapFacSkillController - getAllXmapFsBySkillId");
		List<Xmap_Fac_Skill> xfss = xmapservice.getAllXfsBySkillId(skillid);
		if(xfss.size()>0) {
			return new ResponseEntity<List<Xmap_Fac_Skill>>(xfss,HttpStatus.FOUND);	
		}
		else {
			return new ResponseEntity<Message>(new Message("INF","No records found"),HttpStatus.NOT_FOUND);
		}			
	}
	
	@RequestMapping(value="/addXmapFs", method=RequestMethod.POST)
	public ResponseEntity<?> addXmapFs(@RequestBody Xmap_Fac_Skill xfs){
		System.out.print("\nXmapFacSkillController - addXmapFS");
		boolean res=xmapservice.addXfs(xfs);
		if(res==true) {
			return new ResponseEntity<Xmap_Fac_Skill>(xfs,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Adding Xmap_Fac_Skill record failed"),HttpStatus.CONFLICT);
		}
	}	
	
	@RequestMapping(value="/updateXmapFs", method=RequestMethod.PUT)
	public ResponseEntity<Message> updateXmapFs(@RequestBody Xmap_Fac_Skill xfs){
		System.out.print("\nXmapFacSkillController - updateXmapFs");
		boolean result=false;
		result = xmapservice.updateXfs(xfs);
		if(result==true) {
			return new ResponseEntity<Message>(new Message("INF","Xmap_Fac_Skill info updated successfully"),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Xmap_Fac_Skill updation failed"),HttpStatus.OK);
		}				
	}
	
	@RequestMapping(value="/deleteXmapFs", method=RequestMethod.DELETE)
	public ResponseEntity<Message> deleteXmapFs(@RequestParam("xfsid")String xfsid){
		System.out.print("\nXmapFacSkillController - deleteXmapFs");
		boolean result=false;
		result = xmapservice.deleteXfs(xfsid);
		if(result==true) {
			return new ResponseEntity<Message>(new Message("INF","Xmap_Fac_Skill record deleted successfully"),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Message>(new Message("ERR","Xmap_Fac_Skill deletion failed"),HttpStatus.OK);
		}
				
	}
}
