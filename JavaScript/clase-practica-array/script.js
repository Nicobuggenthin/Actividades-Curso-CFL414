let nombre = prompt("ingrese nombre")
let modificacion 
let nombreact
const nombres = []
let index
    while (nombre !="esc") {
    modificacion = prompt("ag:agregar ,ac:actulice el valor,bo:borrar ,ver:ver lista")
    index = nombres.indexOf(nombre)
        switch (modificacion) {
            case "ag":
            
            if(index == -1){
                nombres.push(nombre)
                alert("usuario agrega corretamente")
            }else{
                alert("nombre repetido")
            }
                break;
            case "ac":
                nombreact = prompt("ingrese nombre nuevo")
                if(index != -1){
                    nombres[index]= nombreact
                    alert("usuario actualizado")
                }else{
                    alert("el nombre a actualizar no existe")
                }
                break
            case "bo":
                if(index != -1){
                    nombres.splice(index,1)
                    alert("usuario borrado")
                }else{
                    alert("el nombre a actualizar no existe")
                }
                break
            case "ver":
                alert("lista:" + nombres)
            break
            default:
                break;
        }
       nombre = prompt("ingrese nombre") 
    }
    
    console.log(nombres)