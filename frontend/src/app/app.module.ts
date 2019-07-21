import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InsertComponent } from './insert/insert.component';
import {FormsModule, ReactiveFormsModule} from  '@angular/forms';
import {DBServiceService} from './dbservice.service';
import {HttpClient, HttpClientModule} from '@angular/common/http';

 
@NgModule({
  declarations: [
    AppComponent,
    InsertComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [DBServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}
