import { environment } from './../../environments/environment';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MunicipiosModel } from '../models/municipios.model';

@Injectable({
  providedIn: 'root'
})
export class ApiBgeMunicipiosService {

  constructor(private http: HttpClient) {}

    getCidadesByUf(uf:string) {
      const url = `${environment.urlApi}/${uf}/municipios`;
      return  this.http.get<MunicipiosModel[]>(url);
    }
}
