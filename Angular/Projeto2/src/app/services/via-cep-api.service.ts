import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import CepModel from '../models/cep-model';

@Injectable({
  providedIn: 'root'
})
export class ViaCepApiService {

  urlViaCep: string = 'https://viacep.com.br/ws';

  constructor(private http: HttpClient) { }

  getCEP(cep: string){
    const urlGet = '${this.urlViaCep}/${cep}/json/';

    return this.http.get<CepModel>(urlGet);
  }

}
