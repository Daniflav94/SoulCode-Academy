import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  /*String Interpolation: utilizar valores que propriedades possuem para mostrá-los para o usuário */
  /*Property binding: utilizar valores de propriedades para atribuí-los a atributos HTML */
  /*Event binding: utilizado para ouvir eventos da DOM dentro do Angular */
  title = 'senha123';
  n1: number = 0
  n2: number = 0
  n3: number = 0
  tipoInput: string = 'password'
  iconeOlho: string = '../assets/olho.png'

  somar(x: number, y: number){
    return x + y
  }

  mudarTipoInput(): void{
    if (this.tipoInput == 'password'){
      this.tipoInput = 'text'
      this.iconeOlho = '../assets/olho-n.png'
    }else{
      this.tipoInput = 'password'
      this.iconeOlho = '../assets/olho.png'
    }
  }

  subtraiContador() : number{
    return this.n3--
  }

  somaContador() : number{
    return this.n3++
  }
}
