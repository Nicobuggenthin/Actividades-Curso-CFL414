let objeto = {
    nombre:"hernan",
    cuil:20346489454,
    partido:"la matanza"
}

const arrayObjetos = [
    {
        nombre:"hernan",
        cuil:20346489454,
        partido:"la matanza"
    },
    {
        nombre:"martin",
        cuil:20235559454,
        partido:"Moron"
    },
    {
        nombre:"fernando",
        cuil:20234489454,
        partido:"quilmes"
    }
]
for(const objeto of arrayObjetos){
    console.log(objeto.partido)
}