let nombre = document.getElementById("nombre")
let precio = document.getElementById("precio")
let cargar = document.getElementById("cargar")
const productos = []
const cargarProducto = () => {
    productos.push({nombre:nombre.value,precio:precio.value})
    console.log(productos)
}

cargar.addEventListener("click",cargarProducto)

