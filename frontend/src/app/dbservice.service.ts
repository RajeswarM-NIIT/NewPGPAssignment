import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {catchError, map, tap} from 'rxjs/operators';
import {ReturnStatement} from '@angular/compiler';
//import {Item} from './Item';
import {Faculty} from './Faculty';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type' : 'application/json'})
};

@Injectable({ 
  providedIn: 'root'
})
export class DBServiceService {

  private Url = "http://localhost:1010/connect/addFaculty";

  constructor(public http:HttpClient) { }

addFaculty(faculty:Faculty) : Observable<Faculty>{
    console.log("service " + faculty.facultyname + ", " + faculty.location);
//   post(url,body,options -> prams, headers)

    return this.http.post<Faculty>(this.Url,faculty).pipe(
       catchError(this.handleError<Faculty>('addFaculty'))
     );
  }
  
  private handleError<T>(operation='operation', result?:T){
      return (error:any): Observable <T> => {
          console.error(error);
          return of(result as T);
      };
  }

}
