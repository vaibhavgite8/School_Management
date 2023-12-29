import { Component, OnInit } from '@angular/core';
import { HighSchool } from '../high-school';
import { SchoolmanageService } from '../schoolmanage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-school-list',
  templateUrl: './school-list.component.html',
  styleUrl: './school-list.component.css'
})

export class SchoolListComponent implements OnInit {
[x: string]: any;
  School: HighSchool[];

  constructor(private schoolService: SchoolmanageService
    , private router: Router) { }


  ngOnInit() {
    this.getSchools();
  }
  private getSchools() {
    this.schoolService.getSchoolList().subscribe(data => {
      this.School = data;
      console.log(data)
    });
  }
  SchoolDetails(schoolregno: number) {
    this.router.navigate(['school-details', schoolregno])
  }

  updateSchool(schoolregno: number) {
    this.router.navigate(['update-school', schoolregno]);
  }

   deleteSchool(schoolregno: number){
  this.schoolService.deleteSchool(schoolregno).subscribe(data => 
   {
    console.log(data);
       this.getSchools();
  })

}
}



