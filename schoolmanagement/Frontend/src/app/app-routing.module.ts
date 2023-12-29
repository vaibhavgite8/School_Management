import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SchoolListComponent } from './school-list/school-list.component';
  import { CreateSchoolComponent } from './create-school/create-school.component';

 import { SchoolDetailsComponent } from './school-details/school-details.component';
import { UpdateSchoolComponent } from './update-school/update-school.component';
import { SigninComponent } from './signin/signin.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SignoutComponent } from './signout/signout.component';


const routes: Routes = [
  
  {path: 'list',component: SchoolListComponent},
    {path : 'add-school',component:CreateSchoolComponent},
   // {path : 'details', component : SchoolDetailsComponent},
    {path: '', redirectTo: 'list', pathMatch: 'full'},
    {path: 'school-details/:schoolregno', component: SchoolDetailsComponent},
   {path : 'update-school/:schoolregno', component: UpdateSchoolComponent},
   {path :'login',component :SigninComponent},
   {path :'logout',component: SignoutComponent},
   {path:'signUp',component: SignUpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
