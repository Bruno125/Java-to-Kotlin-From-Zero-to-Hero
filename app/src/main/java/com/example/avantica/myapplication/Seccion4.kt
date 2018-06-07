package com.example.avantica.myapplication

// ----- 4. CLASSES - DATA CLASSES

// 1. Estamos en el archivo "Seccion4" pero aún así podemos crear una clase "User1" sin problemas!
// 2. Si nuestra clase no tiene nada, ni siquiera necesitamos poner llaves
class User1

// 3. De esta forma, podemos declarar variables y constructor al mismo tiempo!
class User2(val nombre: String,
            val apellido: String)

// 4. Al declarar como "data" class, automáticamente se nos generan los métodos:
//    - equals
//    - toString
//    - hashCode
data class User3(val nombre: String,
                 val apellido: String)

// 5. Los data class nos permite usar el método "copy", para crear copias de un objeto,
//    y nos da la opción de modificar alguno de sus valores
val user = User3("Bruno", "Aybar")
val otroUser1 = user.copy() //copia todos los valores de "user"
val otroUser2 = user.copy(nombre = "Miguel") // cambia el nombre, y copia el apellido
val otroUser3 = user.copy(apellido = "Guerrero") // cambia el apellido, y copia el nombre
val otroUser4 = user.copy(nombre = "Miguel", apellido = "Guerrero")  // cambia nombre y apellido