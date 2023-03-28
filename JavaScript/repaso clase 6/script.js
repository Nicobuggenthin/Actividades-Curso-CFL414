const productos = [
    {id:1,nombre:"Arroz",precio:125},
    {id:2,nombre:"Fideos",precio:70},
    {id:3,nombre:"pan",precio:50},
    {id:4,nombre:"flan",precio:50}

]
const buscado = productos.find(producto => producto.id ==3)
console.log(buscado)

const existe = productos.some(producto => producto.id == 14)
console.log(existe)

const caros = productos.filter(producto => producto.precio > 60)
console.log(caros)

const listaNombres = productos.map(producto => producto.nombre)
console.log(listaNombres)

const cantidadProductos = productos.length
console.log(cantidadProductos)

productos.push({id:5,nombre:"coca cola",precio:150})
productos.splice(0,1)
