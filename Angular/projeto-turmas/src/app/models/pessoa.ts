import { Professor } from './professor';
export class Pessoa {
  id?: number;
  nome?: string;
  idade?: number;
  endereco?: string;
  sexo?: string;

  constructor(obj: Partial<Professor>){
    Object.assign(this, obj)
  }
}
