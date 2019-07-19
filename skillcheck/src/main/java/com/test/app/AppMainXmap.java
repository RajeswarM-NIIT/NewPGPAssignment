package com.test.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.configuration.DBConfig;
import com.test.dao.FacultyDAOInt;
import com.test.dao.SkillDAOInt;
import com.test.dao.XmapFacSkillDAOInt;
import com.test.model.Faculty;
import com.test.model.Skill;
import com.test.model.Xmap_Fac_Skill;

public class AppMainXmap {	
	public static void main(String[] args) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		 XmapFacSkillDAOInt xmapdao = ctx.getBean(XmapFacSkillDAOInt.class);
		 
		 Xmap_Fac_Skill xmap = new Xmap_Fac_Skill("FAC00003","SKL00002");
		 xmapdao.addXfs(xmap);
		 
		 List<Xmap_Fac_Skill> xmaps = xmapdao.getAllXfs();
		 System.out.println(xmaps);
		 
		 xmaps = xmapdao.getAllXfsByFacultyId("FAC00001");
		 System.out.println(xmaps);

		 xmaps = xmapdao.getAllXfsBySkillId("SKL00002");
		 System.out.println(xmaps);
		 
		 
	}
}
