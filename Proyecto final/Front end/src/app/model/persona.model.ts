export class persona{
    id:number | undefined;
    nombre:String | undefined;
    apellido:String | undefined;
    img:String | undefined;

    constructor (nombre: String,apellido: String,img: String){ 
        this.nombre = nombre;
        this.apellido =apellido;
        this.img = img;
    
    }
        

}