/*
const numeros = [1,2,34,56,76]
numeros.forEach((numero)=>{
    console.log(numero)
})
*/
const cursos =[
    {
        nombre:"ingles",
        precio:12000
    },
    {
        nombre:"ingles",
        precio : 24000

    },
    {
        nombre:"javascript",
        precio: 14000
    },
    {
        nombre:"desarrollo web",
        precio:3900
    },
    {
        nombre:"programacion",
        precio:23000
    }

]
let nombreBuscar = prompt("ingrese curso a buscar")
/*
const cursoEncontrado = cursos.find((curso)=>{
    console.log(curso.nombre)
})
*/
const cursosFiltrados = cursos.filter( curso => curso.nombre == nombreBuscar)

const nombresCursos = cursosFiltrados.map(curso=> curso.nombre)
console.log(nombresCursos)





