/*
 function funcion1(par1,par2,par3){
    let variable1 = par1 + " " + par2 + " " + par3
    
    return variable1
 }

 console.log(funcion1("hola","mundo","chau"))
*/
 const funcion1 = (par1,par2,par3) => {
    let variable1 = par1 + " " + par2 + " " + par3
    
    return variable1
 }
 console.log(funcion1("hola","mundo2","chau"))

 const funcion2 = par1 =>  par1*5

 console.log(funcion2(5))

 

 let variable3 = 3424
 const PI = 3.14
 let array2 = ["hola","chau","auto"]
 let array3 = [113,23123,4141,414]
 console.log(array2[0])
 //--------- Objetos js-------------

const persona1 = {
     nombre : "maxi",
     apellido : "rosanda",
     edad : 34,
     direccion : "brandsen 35325"
 }
 console.log(persona1.apellido)
 console.log(persona1["apellido"]) //forma antigua
 persona1.direccion = "brandsen 3532"
 console.log(persona1.direccion)

 