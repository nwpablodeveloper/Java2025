import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { ProductoListaComponent } from "./producto-lista/producto-lista.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  imports: [RouterModule, ],
})
export class AppComponent {
  title = 'inventarios-app';
}
