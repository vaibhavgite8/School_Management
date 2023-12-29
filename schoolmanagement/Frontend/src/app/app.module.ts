import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { CreateSchoolComponent } from './create-school/create-school.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UpdateSchoolComponent } from './update-school/update-school.component';
import { SchoolDetailsComponent } from './school-details/school-details.component';

import { SchoolListComponent } from './school-list/school-list.component';
import { SigninComponent } from './signin/signin.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SignoutComponent } from './signout/signout.component';

@NgModule({
  declarations: [
    AppComponent,
    SchoolListComponent,
    CreateSchoolComponent,
    UpdateSchoolComponent,
    SchoolDetailsComponent,
    SigninComponent,
    SignUpComponent,
    SignoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, FormsModule,
    FormsModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule{}
