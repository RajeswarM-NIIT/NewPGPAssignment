package com.test.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.configuration.DBConfig;
import com.test.dao.FacultyDAOInt;
import com.test.dao.SkillDAOInt;
import com.test.dao.VwXfsDAOInt;
import com.test.dao.XmapFacSkillDAOInt;
import com.test.model.Faculty;
import com.test.model.Skill;
import com.test.model.Vw_Xmap_Fac_Skill;
import com.test.model.Xmap_Fac_Skill;

public class AppMainVwXfs {	
	public static void main(String[] args) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		 VwXfsDAOInt vwdao = ctx.getBean(VwXfsDAOInt.class);		 
		 
		 List<Vw_Xmap_Fac_Skill> vwdata = vwdao.getAllVwXfs();
		 System.out.println(vwdata);

		 System.out.println();
		 vwdata = vwdao.getMappingByFacultyId("FAC00001");// by facid
		 System.out.println(vwdata);		 

		 System.out.println();
		 vwdata = vwdao.getMappingByFacultyName("Chandra"); // by fac name
		 System.out.println(vwdata);

		 System.out.println();
		 vwdata = vwdao.getMappingByFacultyLocation("Hyderabad"); // by fac location
		 System.out.println(vwdata);
		 
		 System.out.println();
		 vwdata = vwdao.getMappingBySkillId("SKL00001"); // by skillid
		 System.out.println(vwdata);

		 System.out.println();
		 vwdata = vwdao.getMappingBySkillName("DBMS"); // by skillname
		 System.out.println(vwdata);
		 
	}
}
