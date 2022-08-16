export class Proyecto{
    id: number;
     titulo_proyecto:String;
     nombre_proyecto:String;
     sobre_proyecto:String;
     img:String; 
    constructor(id:number,titulo_proyecto:String,nombre_proyecto:string,sobre_proyecto:string,img:string){
        this.id=id;
       this.titulo_proyecto=titulo_proyecto;
        this.nombre_proyecto=nombre_proyecto;
        this.sobre_proyecto=sobre_proyecto;
        this.img=img;

        
       
        

    }
}