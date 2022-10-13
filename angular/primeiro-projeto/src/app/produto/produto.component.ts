import { Component } from "@angular/core";

@Component({ //decoration, transforma a classe em um componente do Angular
    selector: 'card-produto',  //chama o componente como um seletor css: <card-produto></card-produto>
    templateUrl: './produto.component.html',  //referencia o endereço arquivo html, todo componente deve ter um componente html
    styleUrls: ['./produto.component.css'] //qual arquivo CSS que o componente utiliza para estilizar seu arquivo html, tem que ser array
})  
export class ProdutoComponent{

}