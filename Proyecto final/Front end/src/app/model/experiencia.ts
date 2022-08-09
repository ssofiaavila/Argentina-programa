export class Experiencia {
    id? : number;
    nombreE : string;
    descripcionE : string;
    inicioE: number;
    finE:number;

    constructor(nombreE: string, descripcionE: string, inicioE: number, finE: number) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.finE= finE;
    }
}