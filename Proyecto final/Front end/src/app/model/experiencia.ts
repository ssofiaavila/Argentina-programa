export class Experiencia {
    id? : number;
    nombreE!: string;
    descripcionE!: string;

    constructor(nombre: string, descripcion: string){
        this.nombreE=nombre;
        this.descripcionE= descripcion;
    }

  
}