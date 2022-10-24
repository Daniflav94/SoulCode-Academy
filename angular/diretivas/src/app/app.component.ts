import { Component } from '@angular/core';
import { Produto } from './Interfaces/Produto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'diretivas';

  nome: string = ''
  imagem: string = ''
  preco: number = 0
  estoque: number = 0
  descricao: string = ''

  produtos: Produto[] = [] //array de objetos interface Produto


  adicionarProduto(evento: any): void {
   
    evento.preventDefault()
    evento.stopPropagation()

    this.produtos.push({
      nome: this.nome,
      imagem: this.imagem,
      preco: this.preco,
      estoque: this.estoque,
      descricao: this.descricao,
    })

    this.nome = ''
    this.imagem = ''
    this.preco = 0
    this.estoque = 0
    this.descricao = ''

  }

  excluir(produto: Produto): void{
    let index = this.produtos.indexOf(produto)
    this.produtos.splice(index,1)
  }


 /*  prod2: Produto = {
    nome: 'Xbox',
    descricao: 'Console da Microsoft',
    estoque: 250,
    preco: 4.000,
    imagem: "https://http2.mlstatic.com/D_NQ_NP_627914-MLA40655732617_022020-O.webp" 
  }*/

}
