import { MunicipiosModel } from './../../models/municipios.model';
import { ApiBgeMunicipiosService } from './../../services/api-bge-municipios.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.scss']
})
export class FormularioComponent implements OnInit {

  cidades$= new Observable<MunicipiosModel[]>();

  constructor(private ibgeService: ApiBgeMunicipiosService) { }

  ngOnInit(): void {
  }

  loadMunicipiosByUF(event: any){
    const uf = (event.target as HTMLSelectElement)?.value;


    if(uf){
      this.cidades$ = this.ibgeService.getCidadesByUf(uf);
      this.ibgeService.getCidadesByUf(uf)
      .subscribe((response)=>{console.log(response)});
    }
  }

}
