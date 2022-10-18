import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CartaoComponent } from './cartao/cartao.component';

@NgModule({
  declarations: [
    AppComponent,
    CartaoComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    FormsModule //ngModel
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
