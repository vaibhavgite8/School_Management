 import { Component, OnInit } from '@angular/core';
  import { HighSchool } from '../high-school';

   import { Router } from '@angular/router';
   import { SchoolmanageService } from '../schoolmanage.service';
  import { error } from 'console';

   @Component({
  selector: 'app-create-school',
  templateUrl:'./create-school.component.html',
 styleUrl: './create-school.component.css' })
  export class CreateSchoolComponent implements OnInit {
   school: HighSchool = new HighSchool();
   constructor(private schoolmanageobj:SchoolmanageService,
     private router: Router){}
  ngOnInit(): void {
     }
       saveSchool(){
       this.schoolmanageobj. CreateSchool(this.school).subscribe(data =>        {
           console.log(data);
        },
        error => console.log(error));
   }
      goToSchoolList(){
 this.router.navigate(['/schools']);
       }
    onSubmit(){
     console.log(this.school);
     this.saveSchool();
      }
   
   }

  

  
 

  
