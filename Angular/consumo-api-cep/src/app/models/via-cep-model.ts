export class ViaCepModel {
  cep?: string;
  logradouro?: string;
  complemento?: string;
  bairro?: string;
  localidade?: string;
  uf?: string;
  ibge?: string;
  gia?: string;
  ddd?: string;
  siafi?: string;
  numero?: number;

  constructor(object: Partial<ViaCepModel>){
    const obj = {
       cep: '89-0000'

    };
    Object.assign(this, obj)
  }


}
