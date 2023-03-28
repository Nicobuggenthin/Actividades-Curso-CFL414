const array0 = []
const array1 = ["jfdgjg","valor","valor2","jgiosdgji","jfsdjog"]
const array2 = [213,231,12313,131]
const array3 = [true,true,false,true]
const array4 = [true,"jfld",3234]

//array1.push("agrega al final")
//array1.unshift("agrega adelante")
//array1.pop() //elimina al final
//array1.shift() //elimina el primero
array1.splice(3,1) //eliminar un elemento en particular
const union = array1.concat(array2) // para unir array
array1.indexOf("valor") //busca la ubicacion
//array1.splice(array1.indexOf("valor"),1)
array1[array1.indexOf("valor")] = "valor nuevo"

for(let i = 0 ;i < array1.length;i++){
    console.log(array1[i])
}

