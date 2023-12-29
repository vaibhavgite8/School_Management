import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { HttpClient } from '@angular/common/http';
import { HighSchool } from './high-school';

@Injectable({
  providedIn: 'root'})
export class SchoolmanageService {

   baseURL:string ='http://localhost:8080/schoolmanagement.com/school';

  constructor(private httpClient : HttpClient) { }

  getSchoolList():Observable<HighSchool[]>{
    return this.httpClient.get<HighSchool[]>(`${this.baseURL}`);
  }
  CreateSchool(school : HighSchool):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,school);
  }
   getSchoolByRegNo(SchoolRegNo: number): Observable<HighSchool>{
          return this.httpClient.get<HighSchool>(`${this.baseURL}/${SchoolRegNo}`);
       }
  updateSchool(schoolRegno: number, school: HighSchool): Observable<Object>
   {
      return this.httpClient.put(`${this.baseURL}/${schoolRegno}`, school);
    }
    deleteSchool(schoolregno: number): Observable<Object>{
         return this.httpClient.delete(`${this.baseURL}/${schoolregno}`);

}
}
    
  
  


//    getSchoolByRegNo(SchoolRegNo: number): Observable<HighSchool[]>{
//     return this.httpsClient.get<HighSchool[]>(`${this.baseURL}/${schoolregno}`);
//  }
   //  updateSchool(schoolRegno: number, school: HighSchool): Observable<Object> {
    //  return this.http.Client.put(`${this.baseURL}/${schoolregno}`, school);
  // }

//    deleteSchool(schoolregno: number): Observable<Object>{
//     return this.httpsClient.delete(`${this.baseURL}/${schoolregno}`);


