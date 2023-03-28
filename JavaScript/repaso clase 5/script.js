
const array1 = ["jose","martin","maria"]
const array2 = [412,3123,12313,424.342]
const array3 = [true,false,true]
const array4 = ["gjasl",313,true,"gklsa"] //tanto no se usa
array1.push("maxi") // agregamos
//array1.unshift("ghñsgjs") //tanto no se usa
//array1.pop() // tanto no se usa
//array1.shift() //tanto no se usa
let index = array1.indexOf("maria") //buscamos
console.log(index)
array1.splice(index,1) //borramos
index = array1.indexOf("maxi")
array1[index] = "hernan" //actualiza
console.log(array1)
const array5 =["diego","agustina"]
const array6 = array1.concat(array5)
//console.log(array6)
//------------------
// quedan vinculados vinculadas
const array7 = array6[1]
console.log(array7)

// no quedan vinculados
const array8 = array6.slice()
array8[2] = "otra cosa 2"
//console.log(array6)
//console.log(array8)


