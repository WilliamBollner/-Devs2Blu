import { TestBed } from '@angular/core/testing';

import { ApiBgeMunicipiosService } from './api-bge-municipios.service';

describe('ApiBgeMunicipiosService', () => {
  let service: ApiBgeMunicipiosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiBgeMunicipiosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
