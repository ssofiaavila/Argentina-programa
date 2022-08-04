import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewEducacionComponent } from './components/education/new-educacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import {EditeducacionComponent } from './components/education/editeducacion.component';

const routes: Routes = [
  {path:'', component: HomeComponent}, /* acá indico a qué componente me quiero direccionar a partir de que ahora implemento los botones*/
  {path:'login', component: LoginComponent},
  {path: 'nuevaExperiencia', component: NewExperienciaComponent},
  {path: 'editExperiencia/:id', component: EditExperienciaComponent},
  {path: 'nuevaEducacion', component: NewEducacionComponent},
  {path: 'editeducacion/:id', component: EditeducacionComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
