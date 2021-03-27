package com.example.sintaxisbasica_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1.
        //variablesYConstantes()

        //Leccion 2.
        //tipoDeDatos()

        //Leccion 3.
        //sentenciaif()

        //Leccion 4
        //sentenciawhen()

        //Leccion 5

    }


    /*Aqui hablaremos de variables y constantes.*/
    private fun variablesYConstantes(){

        //Variables
        var myFirtsVariable ="Hello Firts Variable"
        println(myFirtsVariable)

        //Constantes
        val myFirtsConstant ="Esto se queda Fijo"
        println(myFirtsConstant)

        val mySecondConstant :String = myFirtsVariable
        println(mySecondConstant)

    }

    /*Aqui hablamos de tipos de datos*/
    private fun tipoDeDatos(){

        //Strings
        val myString : String ="Hello"
        val myString2 ="Bienvenido al curso"
        val myString3 =myString+" "+myString2
        println(myString3)

        //Enteros (Byte (-127 to +128), Short (-32768 to 32767), Int, Long)
        var myInt =1
        var myInt2=2
        var myInt3 = myInt+myInt2
        println(myInt3)

        //Decimales (Float, Decimal)
        var myFloat =1.5F
        var myDouble =1.5
        var myDouble2 =2.6
        var myDouble3 =1
        var myDouble4: Double =myDouble+myDouble2+myDouble3
        println(myDouble4)

        //Booblean
        val myBool =true
        val myBool2=false
        println(!myBool)

    }

    /*Aqui hablamos de sentenciaIf*/
    private fun sentenciaif(){

        //Operadores condicionales
        // > Menor que
        // < Mayor que
        // >= Mayor o igual que
        // <= Menor o igual que
        // == Igual que
        // != Diferente de.

        //Operadores Logicos
        // && Operador y
        // || Operador o
        // ! No (Negacion)

        val myNumber=10

        if(myNumber<= 10 && myNumber>5){
            println("$myNumber es menor o igual que 10 y mayot que 5")
        }
        else if(myNumber==60){
            println("$myNumber es igual que 60")
        }
        else if (myNumber==70){
            println("$myNumber es igual que 70")
        }else{
            println("$myNumber es mayor que 10")
        }



    }

    /*Aqui vamos a habla de la sentencia when*/
    private fun sentenciawhen(){

        val country ="Colombia"

        when(country){
            "España"->{ println("El idioma es español") }
            "Colombia"->{ println("El idioma es español")}
            "USA" ->{ println("El idioma es Ingles")}
            else ->{ println("No conocemos el idioma")}
        }

        //When con Int
        val age=10

        when(age){
            0,1,2 ->{
                println("Eres un bebé")
            }
            in 1..10 ->{
                println("Eres un niño")
            }
            in 11..17 ->{
                println("Eres un adolescente")
            }
            in 18..69 ->{
                println("Eres un adulto")
            }
            else ->{
                println("Estes un anciano")
            }
        }
    }

}