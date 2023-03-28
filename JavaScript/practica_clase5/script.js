let nombre = prompt("ingrese nombre")
let apellido = prompt("ingrese apellido")
let edad =prompt("ingrese edad")

let personas = []

while(nombre != "esc"){
//guarda datos en un array
   const personaIngresada = {
       nombre : nombre,
       apellido: apellido,
       edad : edad
   }
    personas.push(personaIngresada)
 nombre = prompt("ingrese nombre")
 if(nombre != "esc"){
    apellido = prompt("ingrese apellido")
    edad = prompt("ingrese edad")
 }

}
console.log(personas)