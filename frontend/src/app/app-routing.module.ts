import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {InsertComponent} from './insert/insert.component';

const routes: Routes = [
  {path : 'insert',component:InsertComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
