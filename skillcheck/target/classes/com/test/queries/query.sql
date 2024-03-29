create table Skill
(
   skillid char(10) primary key,
   skillname char(30) unique,
   skillavailable boolean
)


create table Faculty
(
	facultyid char(10)primary key,
	facultyname char(40),
	location char(50),
	facultyavailable boolean
)


create table Xmap_Fac_Skill
(
	xmapid char(10) primary key,
	facultyid char(10) references Faculty(facultyid),
	skillid char(10) references Skill(skillid),
	xmapavailable boolean
)

-- Faculty
insert into faculty values('FAC00001', 'Raghu', 'Hyderabad', true);
insert into faculty values('FAC00002', 'Spandana', 'Hyderabad', true);
insert into faculty values('FAC00003', 'Chandra', 'Hyderabad',  true);
insert into faculty values('FAC00004', 'Krishna', 'Hyderabad', true);
insert into faculty values('FAC00005', 'Vamsi', 'Hyderabad', true);

-- Skill
insert into skill values('SKL00001','C with DS',true);
insert into skill values('SKL00002','DBMS',true);
insert into skill values('SKL00003','HTML',true);
insert into skill values('SKL00004','Java',true);
insert into skill values('SKL00005','Spring',true);

-- xmap

insert into Xmap_Fac_Skill values ('XFS00001', 'FAC00001','SKL00001',true);
insert into Xmap_Fac_Skill values ('XFS00002', 'FAC00001','SKL00002',true);
insert into Xmap_Fac_Skill values ('XFS00003', 'FAC00001','SKL00003',true);
insert into Xmap_Fac_Skill values ('XFS00004', 'FAC00001','SKL00004',true);
insert into Xmap_Fac_Skill values ('XFS00005', 'FAC00001','SKL00005',true);
insert into Xmap_Fac_Skill values ('XFS00006', 'FAC00002','SKL00001',true);
insert into Xmap_Fac_Skill values ('XFS00007', 'FAC00002','SKL00002',true);
insert into Xmap_Fac_Skill values ('XFS00008', 'FAC00002','SKL00003',true);
insert into Xmap_Fac_Skill values ('XFS00009', 'FAC00002','SKL00004',true);
insert into Xmap_Fac_Skill values ('XFS00010', 'FAC00002','SKL00005',true);
insert into Xmap_Fac_Skill values ('XFS00011', 'FAC00003','SKL00001',true);
insert into Xmap_Fac_Skill values ('XFS00012', 'FAC00003','SKL00002',true);
insert into Xmap_Fac_Skill values ('XFS00013', 'FAC00003','SKL00003',true);
insert into Xmap_Fac_Skill values ('XFS00014', 'FAC00003','SKL00004',true);
insert into Xmap_Fac_Skill values ('XFS00015', 'FAC00003','SKL00005',true);
insert into Xmap_Fac_Skill values ('XFS00016', 'FAC00004','SKL00001',true);
insert into Xmap_Fac_Skill values ('XFS00017', 'FAC00004','SKL00002',true);
insert into Xmap_Fac_Skill values ('XFS00018', 'FAC00004','SKL00003',true);
insert into Xmap_Fac_Skill values ('XFS00019', 'FAC00004','SKL00004',true);
insert into Xmap_Fac_Skill values ('XFS00020', 'FAC00004','SKL00005',true);
insert into Xmap_Fac_Skill values ('XFS00021', 'FAC00005','SKL00001',true);
insert into Xmap_Fac_Skill values ('XFS00022', 'FAC00005','SKL00002',true);
insert into Xmap_Fac_Skill values ('XFS00023', 'FAC00005','SKL00003',true);
insert into Xmap_Fac_Skill values ('XFS00024', 'FAC00005','SKL00004',true);
insert into Xmap_Fac_Skill values ('XFS00025', 'FAC00005','SKL00005',true);




SELECT * FROM FACULTY ;
SELECT * FROM SKILL ;
SELECT * FROM XMAP_FAC_SKILL ;

SELECT * FROM FACULTY where 1=2;
SELECT * FROM SKILLwhere 1=2;
SELECT * FROM XMAP_FAC_SKILL where 1=2 ;


select f.facultyid, facultyname,location,facultyavailable,x.xmapid,x.xmapavailable, s.skillid, s.skillname, s.skillavailable
from Faculty f join XMAP_FAC_SKILL x on f.facultyid = x.facultyid
join SKILL s on x.skillid=s.skillid where facultyavailable=true and skillavailable=true and xmapavailable=true

create view Vw_Xmap_Fac_Skill
as
select f.facultyid, facultyname,location,facultyavailable,x.xmapid,x.xmapavailable, s.skillid, s.skillname, s.skillavailable
from Faculty f join XMAP_FAC_SKILL x on f.facultyid = x.facultyid
join SKILL s on x.skillid=s.skillid where facultyavailable=true and skillavailable=true and xmapavailable=true





