package com.example.demo

import java.util.*

fun main()
{
    println("Enter your year of birth here : ")
    val YoB = readLine()!!.toInt()
    val YID = Calendar.getInstance().get(Calendar.YEAR)
    val age = YID - YoB
    print("your current age is $age ")
    /*val a = 0
    val b = 100
    val c = 100/a*/
}