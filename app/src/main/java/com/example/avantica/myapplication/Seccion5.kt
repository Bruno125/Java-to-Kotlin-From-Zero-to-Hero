package com.example.avantica.myapplication

// ----- 5. INTEROPERABILIDAD JAVA-KOTLIN

class UserKotlin(val nombre: String,
                 val apellido: String)

fun test_5() {
    // 1. Podemos utilizar las clases que están escritas en Java!
    val userJava = Seccion5_Java()

    // 2. En ves de usar el getter, podemos acceder a las variables como si fueran propiedades
    print(userJava.getApellido())
    print(userJava.apellido) // hace lo mismo que el de arriba!

    // 3. En ves de usar el setter, podemos modificar las variables como si fueran propiedades
    userJava.setApellido("Aybar")
    userJava.apellido = "Aybar" // hace lo mismo que el de arriba!

    // 4. El "nombre" no tiene setter pero si getter, así que solo podemos leerlo
    print(userJava.nombre)
    //userJava.nombre = "Bruno" // ---> ERROR! Como no tiene setter, no podemos modificar su valor

    // 5. La "edad" no tiene getter pero si setter, asi que solo podemos modificar
    // print(userJava.edad) // ---> ERORR: no podemos acceder a la edad, no tiene getter
    userJava.setEdad(5)

    // 6. Si SOLO tiene setter, no se considera una propiedad, así que no podemos usar esta sintaxis
    //userJava.edad = 5 // ----> ERROR

}
