export class Persona{
    id: number;
    nombre: String;
    apellido: String;
    img: String;
    sobre_mi:String;
    constructor(id:number,nombre: String, apellido: String, img:String,sobre_mi:String){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.img=img;
        this.sobre_mi=sobre_mi;
        

    }
}