package com.example.avantica.myapplication

import java.util.*

// ----- 1. SINTAXIS BÁSICA

// 1. Se utiliza "fun" para denotar que es una funcion
// 2. Para los parametros, primero el nombre, luego el tipo
// 3. Si no se retorna ningún valor, no se pone nada
fun miFuncion(num1: Int, num2: Int) {

    // 5. A las variables VAL solo se le asigna su valor una vez
    val nombre = "Bruno"
    //nombre = "Miguel" //----> ERROR!!!
    // "val" equivale a marcar una variable como "final" en Java

    // 6. tambien se puede usar "VAR", y su valor se puede modificar
    var apellido = "Aybar"
    apellido = "Guerrero" // ----> No hay problema!

    // 7. Los valores que se reciben como parámetros, también son inmutables
    //num1 = 2 //----> ERROR!!

    // 8. Kotlin puede INFERIR el tipo de dato. Es decir, si le asignas una
    //    entero a una variable, sabrá que es de tipo "Int"
    val numero = 1 // Int
    val decimal = 1.0 // Double

    // 9. Pero también puedes especificar el tipo de dato
    val otroNumero: Int = 2

}

// 10. El tipo de dato de retorno se especifica al FINAL
fun sumar(num1: Int, num2: Int) : Int{
    return num1 + num2
}

// 11. Si la función solo tiene una linea, se puede omitir las llaves
//     y asignar el valor de retorno con "="
fun sumar2(num1: Int, num2:Int): Int = num1 + num2

// 12. En ese caso, también se puede omitir el tipo de dato de retorno, el cual es INFERIDO
fun sumar3(num1: Int, num2:Int) = num1 + num2

// 13. Podemos definir parámetros por defecto en nuestra funcion.
fun crearAnimal(nombre: String,
                tipo: String = "Felino",
                edad: Int = 1) {
    //...
}
// Ahora, podemos invocar nuestra función de estas 3 formas
val gato1 = crearAnimal("Gato", "Felino", 1)
val gato2 = crearAnimal("Gato", "Felino") // se asigna el valor por defecto: edad = 1
val gato3 = crearAnimal("Gato") // se asigna valor por defecto: tipo = "Felino", edad = 1
// val gato4 = crearAnimal() // ERROR --> el "nombre" no es opcional, tenemos que pasar un valor!

// 14. Podemos hacer uso de "NAMED ARGUMENTS", de esta forma
val gato4 = crearAnimal(nombre = "Gato", tipo = "Felino", edad = 2)
val gato5 = crearAnimal(nombre = "Gato", edad = 2)
val gato6 = crearAnimal(edad = 2, nombre = "Gato") // incluso podemos invertir el orden!

// 15. Solo podemos usar named arguments, cuando la función que invocamos está escrita en Kotlin
//val date = Date(date = 1) //---> ERROR! "Date" está escrito en java, no soporta named arguments
val date2 = Date(1)
