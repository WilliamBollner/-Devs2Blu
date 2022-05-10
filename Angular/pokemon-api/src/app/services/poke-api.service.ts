import { PokemonList } from './../models/pokemon/pokemon-list';
import { environment } from './../../environments/environment';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { offset } from '@popperjs/core';
import { Pokemon } from '../models/pokemon/pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeApiService {

  constructor(private http: HttpClient) {}

    getListPokemons(next?:string, offset:number = 0, limit: number = 0){
      let url:string = `${environment.urlPokeApiBase}/pokemon`;

      if(next){
        url = next;
      }

      if(!(offset && limit)){
        url += `?offset=${offset}&limit=${limit}`;
      }

      return this.http.get<PokemonList>(url);
    }

    getPokemonByNameOrId(nameOrId: string){
      let url: string = `${environment.urlPokeApiBase}/pokemon/${nameOrId}/`;

      return this.http.get<Pokemon>(url);
    }


}
