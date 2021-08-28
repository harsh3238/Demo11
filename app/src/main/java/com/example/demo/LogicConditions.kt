package com.example.demo

import java.lang.reflect.Constructor

/*
fun main()
{
    println("Enter Marks")
    val marks = readLine()!!.toInt()

    if(marks<=10) print("E")
    else if(marks in 10..20 || marks in 20..40) print("D")
    else if (marks in 41..60) print("C")
    else if(marks in 60..80) print("B")
    else if(marks in 80..100) print("A")
    else print("undefined")

}*/

/*use of when*/

/*
fun main()
{
    println("Choose atleast one :  ")

    val crm_id = readLine()!!.toInt()

    when(crm_id)
    {
        1 ->{
          print("A")

        }
        2 ->{
            print("B")

        }
        3 ->{
            print("C")

        }

        else ->{
            print("You Choose Nothing")
        }
    }
}*/
/*

fun main()
{
    val isMarried = false
    val GPA = readLine()!!.toDouble()

    val isQualified = if( isMarried==false && GPA<=3.8 ) print("notQualified")
    else
    print("IsQualified")
}
*/
//for loop//
/*
fun main()
{
    println("Start App")
    println("============Increment By 3=============")
    for (i in 0..100 step 3)
        print("$i"+" ")
    println("============Decrement By 2=============")
    for(i in 100 downTo 0 step 2)
        print("$i"+" ")
    println("End App")
}
*/
//do while
/*

fun main(){
    var i = 0
    while (i<=10){
        print("$i"+" ")
    i++
    }
    println()

    for(i in 1..10){
        println("$i"+" ")
    }


}
*/

/*
fun main()
{
    print("Do while")
    var i = 1
    do{
        print("count $i")
        i+= 2
    }while (i<=20)
}*/

/*fun addNumbers(x:Int, y:Int ){
    val temp = x+y
    print("Ans = $temp")

}

fun main(){
    addNumbers(3,4)
    addNumbers(5,6)
    addNumbers(7,8)
    addNumbers(8,9)

    print("main function end")
}*/

// function overload - same name different parameters or values
/*

fun  add(number1:Int, number2:Int):Int{
    return number1+number2
}
fun  add(number1:Int, number2:Int, number3:Int):Int{
    return number1+number2+number3
}
fun  add(number1:Int, number2:Int,number3:Int, number4:Int):Int{
    return number1+number2+number3+number4
}

fun main(){
    println(add(3,4))
    println(add(3,4,10))
    println(add(3,4,10,14))
}
*/

// polymorphism- same func || same name || same parameters || different datatypes
/*

fun  showinfo(CardId:Int){
    println("CardId: $CardId")
}

fun  showinfo(Name:String){
    println("Name: $Name")
}

fun main(){
    showinfo("abc")
    showinfo(1324)
}*/

// local var and global var

/*
fun  main(){
    val str1 = "Enter your name"
    val str2 = str1 as String
    println(str1)
}*/
/*

open class operations(){
    fun sum(number1:Int,number2:Int):Int{
        return number1+number2
    }

}

class Multioperations:operations(){
    fun div(number1: Int,number2: Int):Int{
        return number1/number2
    }
}

fun main(){
    var op = operations()
    var sum = op.sum(45,39)
    println("sum : $sum")
    var op1 = Multioperations()
    var div = op1.sum(496,22)
    println("div : $sum ")
}*/
//class constructor

/*
class cons(var type:String,val model:Int, val price:Double, val milesdrive:Int, val owner:String ){
    init {
        println("Object class is created")
    }
    fun getCarPrice():Double{
        return this.price- (this.milesdrive.toDouble()*10)
    }
}
*/

