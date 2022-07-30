import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyproyectsComponent } from './myproyects.component';

describe('MyproyectsComponent', () => {
  let component: MyproyectsComponent;
  let fixture: ComponentFixture<MyproyectsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyproyectsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyproyectsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
