import { Component, OnInit } from '@angular/core';
import { HighSchool } from '../high-school';
import { ActivatedRoute } from '@angular/router';
import { SchoolmanageService } from '../schoolmanage.service';

@Component({
    selector: 'app-school-details',
    templateUrl: './school-details.component.html',
    styleUrl: './school-details.component.css'
})
export class SchoolDetailsComponent implements OnInit {
    schoolRegno: number;
    school: HighSchool
    //schools : HighSchool[];

    constructor(private route: ActivatedRoute, private schoolService: SchoolmanageService) { }

    ngOnInit(): void {
        this.schoolRegno = this.route.snapshot.params['schoolregno'];

        this.school = new HighSchool();

        console.log("school regno: "+this.schoolRegno)

        this.schoolService.getSchoolByRegNo(this.schoolRegno).subscribe(data => {
            this.school = data;
        })
    }

}
