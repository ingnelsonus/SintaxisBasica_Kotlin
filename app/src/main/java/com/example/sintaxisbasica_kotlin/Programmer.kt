package com.example.sintaxisbasica_kotlin

class Programmer(var name:String,var age:Int,var languajes:Array<Language>,var friends:Array<Programmer>?=null) {

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT,
        CSHARP
    }


public fun code(){
    for(langua:Language in languajes){
        println("Estoy programando en $langua")
    }
}



}