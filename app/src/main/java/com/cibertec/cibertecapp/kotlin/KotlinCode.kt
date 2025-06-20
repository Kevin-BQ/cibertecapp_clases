package com.cibertec.cibertecapp.kotlin

fun main() {

    // 1. Variables
    // Variables de valor mutable
    var miPrimerExamen: Int = 15

    // Variables de valor inmutable
    val miSegundoExamen: Int = 13

    // 2. Inferencia de tipo
    var miEdad: Int = 33
    var miDni = 45645645

    // 3. Tipos de Datos
    var myInt: Int = 10
    var myLong: Byte = 12
    var myShort: Short = 20

    var myDouble: Double = 1.20
    var myFloat: Float = 6.5f

    var myBoolean: Boolean = true

    print(myBoolean)
    print("Mi variable es $myBoolean")

    // Arrays lineales
    val myArray = arrayOf(15,13,15,true)
    myArray[0] = 18

    val myArrayInt = arrayOf<Int>(15, 13, 15)
    myArrayInt[0] = 18

    // Lista inmutable
    val myList = listOf(15,13,15) // Lista de tipos de documentos de identicacion en Perú

    // Arrays mutable - Arreglo dinamico
    val myArrayListOfInt = mutableListOf(15, 13, 15)
    myArrayListOfInt[0] = 18
    myArrayListOfInt.add(20)

    // Condicionales
    val aprobare: Boolean = false
    if (aprobare) {
        println("Aprendere iOS")
    } else {
        println("Este ciclo aprendo, el otro apruebo")
    }

    // for
    var cursos = listOf("Android", "iOS", "Java")
    for (curso in cursos) {
        println(curso)
    }

    for((index, curso) in cursos.withIndex()) { // index, contenido
        println("Curso $index: $curso")
    }

    // While
    var contador: Int = 0
    while (contador < cursos.size) {
        println(cursos[contador])
        contador++
    }

    // Do While
    var maximo: Int = 10
    var contador2: Int = 0
    do {
        println("Contador: $contador2")
        contador2++
    } while (contador2 < maximo)

    // When
    val mes: Int = 1
    when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "No existe ese mes"
    }

    // Operadores
    print(1+1)
    print(5-2)
    print(5*5)
    print(25/5)
    print(9%4) // Modulo (resto)

    val sumar = sumar(1,2)

}

fun sumar(a: Int, b: Int): Int {
    val resultado = a + b
    print(resultado)
    return resultado
}