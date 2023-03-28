
let numero1 = prompt("ingrese un numero")
let numero2 = prompt("ingrese otro numero")
let operacion = prompt("ingrese operacion (suma,resta,multi)")
let resultado
numero1 = parseInt(numero1)
numero2 = parseInt(numero2)

if(operacion == "suma"){
   resultado  = numero1 + numero2
}
if(operacion == "resta"){
    resultado = numero1 - numero2
}
if(operacion == "multi"){
    resultado = numero1 * numero2
}
console.log(resultado)

