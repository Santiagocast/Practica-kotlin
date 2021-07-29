package com.includehelp.basic

fun mismoLargo(string1 :String, string2: String):Boolean{
    return string1.length == string2.length 
}

fun verificarAnagrama (string1 :String, string2: String):Boolean{
    val array = string1.toCharArray()
    val array2= string2.toCharArray()
    val arrayOrdenado1= array.sort()
    val arrayOrdenado2= array2.sort()
    return arrayOrdenado1 == arrayOrdenado2
}

fun main(args: Array<String>) {
    var string1 = readline()
    var string2 = readline()
    
    var resultado = mismoLargo(string1,string2) && verificarAnagrama(string1,string2)
    println(resultado)

    
}