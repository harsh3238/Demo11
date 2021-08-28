package com.car.maintain

class Car(var type:String,val model:Int, val price:Double,
          val milesdrive:Int, val owner:String ) {
    init{
        println("Object Class is Created")
    }
    fun getCarPrice():Double{
        return this.price-(this.milesdrive.toDouble()*10)
    }
}
/*
fun main(){
    val car = Car("BMW",2015,1000000.0,2500,"SURESH")
    println(car.milesdrive)
    println(car.getCarPrice())
}*/

//print list of cars

fun  main(){
    val listofCar = arrayListOf<Car>()
    listofCar.add(Car("bmw",2022,2000000.0,2566,"bro"))
    listofCar.add(Car("bmw",2021,3050220.0,1236,"Crum"))
    listofCar.add(Car("audi",2019,2012420.0,2556,"rex"))

    for (car:Car in listofCar)
    {
        println("---------------")
        println(car.owner)
        println(car.getCarPrice())
    }
}