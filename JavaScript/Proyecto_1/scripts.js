function capturar(){

    function Persona(nombre,apellido,email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
    }
    let nombreAgregar = document.getElementById("nombre").value;
    let apellidoAgregar = document.getElementById("apellido").value;
    let emailAgregar = document.getElementById("email").value;

    nuevaPersona = new Persona(nombreAgregar,apellidoAgregar,emailAgregar);
    //console.log(nuevaPersona)
    agregar();
}

let baseDatos=[]
    function agregar(){
        baseDatos.push(nuevaPersona);
        console.log(baseDatos);
    }