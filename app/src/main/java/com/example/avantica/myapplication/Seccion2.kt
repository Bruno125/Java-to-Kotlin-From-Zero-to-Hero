package com.example.avantica.myapplication

// ----- 2. MANEJO DE NULOS

fun test() {

    // 1. En Java, cuando no asignas un valor a una variable , su valor por
    //    defecto es NULL / FALSE / 0.
    //    En Kotlin, TIENES que especificar un valor una variable si quieres usarla
    val nombre: String = "Bruno"

    // 2. Sin embargo, a un "String" no podemos asignarle NULL
//    val apellido: String = null // Des-comentame y tendrás un ERROR!

    // 3. Si quieres asignarle null, tienes que declararlo como "String?"
    val apellido: String? = null

    // 4. El "?" al final, denota que es una variable que acepta nulos.
    // 5. Si no tinee "?", podemos asumir que ese valor NO será nulo (*)

    // 6. Este código no nos dará NULL POINTER EXCEPTION
    nombre.contains("Bruno")

    // 7. Sin embargo, en Java, este sí
    // apellido.contains("Aybar") // ---> ERROR!!

    // 8. Para poder usar una variable que puede ser nula de forma segura,
    //    usamos nuevamente el "?"
    apellido?.contains("Aybar")
    // Esto quiere decir "Solo ejecuta esta función, si es que apellido no es nulo"

}

// *: Una variable que no esté marcada como opcional ("?") también puede ser NULA,
//    en algunos casos particulares