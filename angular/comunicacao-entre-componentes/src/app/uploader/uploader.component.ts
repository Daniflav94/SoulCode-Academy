import { outputAst } from '@angular/compiler';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-uploader',
  templateUrl: './uploader.component.html',
  styleUrls: ['./uploader.component.css']
})
export class UploaderComponent implements OnInit {

  @Output() //permite que uma propriedade emita um evento, enviando informações
  uploadCompleto: EventEmitter<string> = new EventEmitter<string>() //Event emitter é uma classe que te permite criar eventos customizados dentro do Angular, new EventEmitter cria o objeto

  constructor() { }

  ngOnInit(): void {
  }

  fazerUpload() {
    alert('Upload iniciando...')
    this.uploadCompleto.emit() //emit() serve para iniciar a emissão do evento personalizado
  }

}
