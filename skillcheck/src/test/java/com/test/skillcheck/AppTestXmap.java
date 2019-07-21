package com.test.skillcheck;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.test.configuration.DBConfig;
import com.test.dao.FacultyDAOInt;
import com.test.dao.SkillDAOInt;
import com.test.dao.VwXfsDAOInt;
import com.test.dao.XmapFacSkillDAOInt;
import com.test.model.Faculty;
import com.test.model.Skill;
import com.test.model.Vw_Xmap_Fac_Skill;
import com.test.model.Xmap_Fac_Skill;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringJUnitConfig(DBConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTestXmap {

	@Autowired
	private XmapFacSkillDAOInt xmapdao;
	
	private Xmap_Fac_Skill xmap;

	@Before
	public void setup() {
		xmap = new Xmap_Fac_Skill("FAC00001","SKL00001");		
	}

	@Test
	public void addXmap() {		
		assertTrue(xmapdao.addXfs(xmap));
		xmapdao.deleteXfs(xmap.getXmapid());
	}	

	
	
	@Test
	public void geXmapById() {
		xmapdao.addXfs(xmap);
		assertNotNull(xmapdao.getXfsById("XFS00001"));
		xmapdao.deleteXfs(xmap.getXmapid());
	}	
	
	@Test
	public void getAllSkills() {
		assertNotNull(xmapdao.getAllXfs());		
	}
	
}
