package com.example.avantica.myapplication

import java.util.*

// ----- 3. FUNCIONES: CIUDADANOS DE PRIMERA CLASE

// 1. Una funcion puede estar fuera de una clase!
fun soyIndependiente() {
    // no necesito de una clase para existir!
}

// 2. Se puede recibir una función como parámetro. Mira el parámetro "cuerpo"
fun repetir(veces: Int, cuerpo: ()->Unit) {
    // 2.1. "()" indica que no recibe parámetros
    // 2.2. "->" indica que se va a especificar el valor de retorno
    // 2.3. "Unit" indica el valor de retorno (en este caso, Unit equivale a "Void" de Java)

    for (i in 0..veces) { // Esto iterará el "i" desde 0 hasta veces-1
        cuerpo() // podemos invocar a esta variable como si fuera una funcion!
    }

}

fun testFunciones() {

    // 3. La función se pasa entre llaves
    repetir(3, { print("Hola!") }) // ejecutará el print 3 veces

    // 4. Si la función es el último parámetro, se puede sacar fuera de los parentesis
    repetir(3) { print("Hola!") }

}

//  5. Ahora probemos recibiendo una funcion que recibe dos parámetros, y devuelve un Boolean
fun repetir2(veces: Int, cuerpo: (String, String)->Boolean) {

    for (i in 0..veces) {
        val cond = cuerpo("a", "b") // "cond" será de tipo BOOLEAN
    }

}

// 6. Invoquemos a dicha funcion
fun test3_1() {
    repetir2(3) { a, b -> // Tenemos que especificar que estamos recibiendo dos parametros
        a == b // y tenemos que devolver un Boolean!
    }
}