import { Component } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrl: './signin.component.css'
})
export class SigninComponent {
  loginStatus:any=sessionStorage.getItem("loginStatus");

  constructor(private service : UserServiceService, private router:Router)
  {
  }
  
  signin(email:any, password:any)
  {
    this.service.signin(email,password).subscribe(
      response => {
        console.log(response);
        alert('login successful');
        sessionStorage.setItem("loginStatus","active");
        sessionStorage.setItem("userId",response.userId);
        sessionStorage.setItem("userRole",response.userRole);
        this.goTo();
    },
    () => { alert('Wrong email Id or password!!');  }
    );
  }
  signUp(){
    this.router.navigate(['signup'])
  }

  goTo(){
   
      this.router.navigate(['list'])

}
}
