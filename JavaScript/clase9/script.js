let nombre = document.getElementById("nombre")
let edad = document.getElementById("edad")
let direccion = document.getElementById("direccion")
let boton = document.getElementById("boton")
const personas = []

const agregarPersona = () => {
    personas.push(
        {
            nombre:nombre,
            edad: edad,
            direccion: direccion
        }
    )
    console.log(personas)

}
boton.addEventListener("click",agregarPersona)


