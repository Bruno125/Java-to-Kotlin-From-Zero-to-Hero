package com.example.avantica.myapplication

import org.junit.Test

class KotlinTests {

    @Test
    fun testWhen() {
        val name = "Bob"
        when(name) {
            "Bob" -> print("Bob es una esponja")
            "Patricio" -> print("Patricio es una estrella")
            "Arenita" -> print("Arenita es una ardilla")
        }
    }

}