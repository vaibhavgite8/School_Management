import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signout',
  templateUrl: './signout.component.html',
  styleUrl: './signout.component.css'
})
export class SignoutComponent implements OnInit {
  constructor(
  
    private userService: UserServiceService,
    private router: Router) {}

  
  ngOnInit(): void {
    this.userService.logOut();
    this.router.navigate(['/login'])
    
  }
}




