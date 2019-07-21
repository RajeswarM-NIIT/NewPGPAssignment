import { Component, OnInit } from '@angular/core';
import {Faculty} from '../faculty';
import {DBServiceService} from '../dbservice.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})


export class InsertComponent implements OnInit {

faculties:Faculty[];
faculty: Faculty;

constructor(public dbservice:DBServiceService){
  // this.faculty = new Faculty();
  // console.log(this.faculty);
}

 ngOnInit(){

 }

 add(facultyname:string, location:string):void {
  console.log(facultyname);
  console.log(location);
  //facultyid=facultyid.trim();
  facultyname=facultyname.trim();
  location=location.trim();
  this.dbservice.addFaculty({ facultyname,location}as Faculty)
  .subscribe(faculty=>{
    console.log("inside add");
  });

   

 
 
 
 
 
 
  

 }


}
