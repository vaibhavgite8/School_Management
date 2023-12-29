import { TestBed } from '@angular/core/testing';

import { SchoolmanageService } from './schoolmanage.service';

describe('SchoolmanageService', () => {
  let service: SchoolmanageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SchoolmanageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
