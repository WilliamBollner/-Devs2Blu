import { ViaCepModel } from './../models/via-cep-model';
import { environment } from 'src/environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ViaCepApiService {

  constructor(private http: HttpClient) { }

  getCep(cep: String){
    const urlGet = `${environment.urlApiViaCep}${cep}/json/`;
    return this.http.get<ViaCepModel>(urlGet);
  }
}
