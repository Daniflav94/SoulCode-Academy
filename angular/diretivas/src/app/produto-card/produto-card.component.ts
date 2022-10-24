import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Produto } from '../Interfaces/Produto';

@Component({
  selector: 'produto-card',
  templateUrl: './produto-card.component.html',
  styleUrls: ['./produto-card.component.css']
})
export class ProdutoCardComponent implements OnInit {

  @Input() //o obj prod vai receber dados externos
  prod: Produto = {
    descricao: '',
    estoque: 0,
    imagem: '',
    nome: '',
    preco: 0

  }

  mostrarProduto: boolean = true


  esconderProduto(){
    this.mostrarProduto = false
    
  }

  revelarProduto(){
    this.mostrarProduto = true
    
  }

  @Output()
  meuEvento: EventEmitter<any> = new EventEmitter<any>()

  excluirProduto() {
    
    this.meuEvento.emit()    
  }



  constructor() { }

  ngOnInit(): void {
  }

}
