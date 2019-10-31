import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppmainComponent } from './appmain/appmain.component';


const routes: Routes = [
  {path:'', component:AppmainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
