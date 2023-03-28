/*
console.log("hgjlidsghj")
let variable1 = 12
let variable2 = "hola mundo"
let variable3 = true

const PI = 3.14
variable1 = -50

let resultado = variable1 + PI
console.log(resultado)
resultado = variable1 - PI
console.log(resultado)
resultado = variable1 / PI
console.log(resultado)
resultado = variable1 * PI
console.log(resultado)

if(variable1 == 12){
    console.log("variable1 es igual a " + variable1)
}else{
    console.log("no es igual a 12")
}

let variable4 = prompt("ingrese un valor")
variable4 = parseInt(variable4)
resultado = variable1 + variable4
alert("el resultado es: " + resultado)
*/
/*
let usuario = prompt("ingrese su nombre")
let password = prompt("ingrese su password")
let usuarioInicioSesion = false
if(usuario == "maxi" && password == 1234){
    usuarioInicioSesion = true
}

if(usuarioInicioSesion == true){
    let numero1 = prompt("ingrese un numero")
    let numero2 = prompt("ingrese numero 2")
}else{
    alert("usuario no registrado")
}
*/
/*
if(variable1 <= 0 || variable1 >= 100){
    console.log("se cumplio")
}else if(variable1 <= 50){
    console.log("el valor esta este 100 y")
}else if(variable1 < 100){
    console.log("jfoisgjs")
}
else{
    console.log("no se cumple")
}
*/
/*
let variable5 = ["hola","hola mundo","chau","maxi","auto","tenis"]
let variable6 = [12,23213,2323,2313]
let variable7 = [true,false,true]

console.log(variable5[0])
variable5.push("agregue")
variable5.push("otro valor")
console.log(variable5)
for(let i = 1;i <= 10;i++){
    if( i == 5 ){
        break
    }
 console.log(i)
}

for(let i = 0 ;i < variable5.length;i++){
    if(variable5[i] == "chau"){
        console.log("el valor: " + variable5[i] + " esta en la posicion " + i)
        break
    }
}
for(let i = 0 ;i <= 10;i++){
    if(i == 5){
        continue
    }
    console.log(i)
}
*/
/*
let valor = prompt("ingrese un valor")

while(valor != "esc"){
    console.log(valor)
    valor = prompt("ingrese otro valor")
}
*/
/*
let valor = prompt("ingrese valor")
let repe = prompt("ingrese cantidad de repeticiones")
valor = parseInt(valor)
repe = parseInt(repe)
for(let i = 1;i <= repe;i++){
    valor = valor + 1
    console.log(valor)
}
*/
let valor = prompt("ingrese texto")
let i = 1
while(valor !="esc"){
    console.log(valor + i)
    i++
    valor = prompt("ingrese texto")
}