import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'comunicacao-entre-componentes';

  mostraMsg() {
    alert('O upload foi concluído com sucesso')
  }
}
