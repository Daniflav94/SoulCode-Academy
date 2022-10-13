import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProdutoComponent } from './produto/produto.component';
import { NavbarComponent } from './navbar/navbar.component';

//os componentes criados devem ser registrados aqui no app.module

@NgModule({  //tem o papel do decoration
  declarations: [  //declarations servem para registrar componentes, pipes, diretivas e outras estruturas do angular
    AppComponent,
    ProdutoComponent,
    NavbarComponent
  ],
  imports: [  //servem para registrar outros módulos dentro de um módulo
    BrowserModule
  ],
  providers: [], //serve para registrar serviços e interceptadores HTTP
  bootstrap: [AppComponent]
})
export class AppModule { }
