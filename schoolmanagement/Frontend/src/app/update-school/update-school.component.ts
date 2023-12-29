import { Component, OnInit } from '@angular/core';
import { SchoolmanageService } from '../schoolmanage.service';
import { HighSchool } from '../high-school';
import { ActivatedRoute, Router } from '@angular/router';
import { error } from 'console';
import { isDataView } from 'util/types';

@Component({
    selector: 'app-update-school',
    templateUrl: './update-school.component.html',
    styleUrl: './update-school.component.css'
})
export class UpdateSchoolComponent implements OnInit {


    schoolRegno: number;
    school: HighSchool = new HighSchool();
    schools: HighSchool[];



    constructor(privateroute: ActivatedRoute,
        private schoolService: SchoolmanageService, private router: Router, private route: ActivatedRoute) { }

        
    ngOnInit(): void {
        this.school = new HighSchool();
        this.schoolRegno = this.route.snapshot.params['schoolregno'];
        this.schoolService.getSchoolByRegNo(this.schoolRegno)
            .subscribe(data => {
                this.school = data;
                console.log(this.school)

            }, error => console.log(error));
    }
    updateSchool() {

        this.schoolService.updateSchool(this.schoolRegno, this.school)
            .subscribe(data => {
                console.log(data);
                this.school = new HighSchool();
                this.schoolService.getSchoolList().subscribe(data => {
                    this.schools = data;
                });
            }, error => console.log(error));
    }

    onSubmit() {
        this.schoolService.updateSchool(this.schoolRegno, this.school).subscribe(data => {
            this.goToSchoolList();
        }
            , error => console.log(error));
    }
    goToSchoolList() {
        this.router.navigate(['/schools']);
    }
}




























