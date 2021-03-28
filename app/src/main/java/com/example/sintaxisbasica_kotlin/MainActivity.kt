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
        //arrays()

        //Leccion 6.
        //maps()

        //Leccion 7.
        //loops()

        //Leccion 8
        //nullSafety()

        //Leccion 10
        clases()


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

    /*Aqui vamos a hablar de arrays*/
    private fun arrays(){
        val name ="Nelson"
        val surName ="Usuga"
        val company ="CopEngienering"
        val age ="30"

        //Creacion de un array.
        val myArray:ArrayList<String> = arrayListOf<String>()

        //1. Añadir datos uno a uno
        //myArray.add(name)
        //myArray.add(surName)
        //myArray.add(company)
        //myArray.add(age)

        //Añadir un conjunto de datos.
        myArray.addAll(listOf("Hola","Bienvenidos","Al Tutorial"))
        println(myArray)

        //Acceso a datos.
        val myCompany:String = myArray[2]
        println(myCompany)

        //Modificacion de datos.
        myArray[5]="Suscribete y activa la campana"

        //Eliminar un Iten.
        myArray.removeAt(4)

        println(myArray)

        //Recorrer un array
        myArray.forEach {
            println(it)
        }

    }

    /*Aqui vamos a hablar de Mapas*/
    private fun maps(){
        //Sintaxis.
        var myMap:Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elementos
        myMap = mutableMapOf("Nelson" to 1,"Pedro" to 2,"Sara" to 5)
        println(myMap)

        //Añadir un solo valor.
        myMap["Ana"]=7
        myMap.put("Maria",8)
        println(myMap)

        //Acceso a datos.
        println(myMap["Nelson"])

        //Eliminar
        myMap.remove("Nelson")

    }

    /*Aqui hablamos de loops*/
    private fun loops(){

        //Bucles
        val myArray:List<String> = listOf("Hola","Bienvenido al tutorial","Suscribete")
        val myMap: MutableMap<String,Int> = mutableMapOf("Nelson" to 1,"Pedro" to 2,"Sata" to 5)

        //For.
        for (myItem in myArray){
            println(myItem)
        }

        for(myElement:MutableMap.MutableEntry<String,Int> in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        //While
        var x=0

        while (x<10){
            println(x)
            x++

        }


    }

    //Aqui hablamos de seguridad contra Nulls.
    private fun nullSafety(){

        var myString ="Nelsonu"
        //myString= null
        println(myString)

        var mySafetyString:String? ="MoureDev null Safety"

        println(mySafetyString?.let { println(it) })

    }

    /*Aqui hablamos de clases*/
    private fun clases(){

        var nelson =Programmer("Nelson",30, arrayOf(Programmer.Language.CSHARP,Programmer.Language.KOTLIN))
        println(nelson.name)
        nelson.code()

        var angie = Programmer("Anfie",30, arrayOf(Programmer.Language.JAVA), arrayOf(nelson))
        angie.code()

        println("${angie.friends?.first()?.name} es manigo de Angie")
    }

}