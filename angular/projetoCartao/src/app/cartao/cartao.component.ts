import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cartao',
  templateUrl: './cartao.component.html',
  styleUrls: ['./cartao.component.css']
})
export class CartaoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  nome: string = "Nome Sobrenome";
  nomeDigitado: string = "";
  numCartao: string = "0000 0000 0000 0000";
  dataExpMes: string = "MM";
  dataExpAno: string = "AA";
  codigoCVC: string = "123";
  bandeira: string = "";
  bandeiraMaster: string = "https://logosmarcas.net/wp-content/uploads/2020/09/Mastercard-Logo.png"
  bandeiraVisa: string = "https://logodownload.org/wp-content/uploads/2016/10/visa-logo-1.png"
  bandeiraElo: string = "https://imagensemoldes.com.br/wp-content/uploads/2020/06/Bandeira-de-Cart%C3%A3o-PNG-Elo-1280x720.png"

  limparCampoNome(){
    this.nome = ''
  }

  limparCampoNum(){
    this.numCartao = ''
  }

  limparCampoDatas(){
    this.dataExpMes = ''
    this.dataExpAno = ''
  }

  limparCampoCVC(){
    this.codigoCVC = ''
  }

  trocaBandeira(){
    if(this.numCartao.startsWith('5')){
      this.bandeira = this.bandeiraMaster
    } else if (this.numCartao.startsWith('4')){
      this.bandeira = this.bandeiraVisa
    } else if (this.numCartao.startsWith('3')){
      this.bandeira = this.bandeiraElo
   }
  }

  trocaNome(){
    this.nome = this.nomeDigitado
  }
}
