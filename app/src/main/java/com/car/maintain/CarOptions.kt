package com.car.maintain


open class CarOptions() {
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesdrive:Int?=null
    var owner:String?=null

    constructor(type:String,model:Int,price:Double,
                milesdrive:Int,owner:String):this(){
                    this.type = type
                    this.model = model
                    this.price = price
                    this.milesdrive = milesdrive
                    this.owner = owner

                }

    constructor(type:String, model:Int, price:Double,
                        milesdrive:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesdrive = milesdrive


    }

    fun getCarPrice():Double{
        return this.price!!-(this.milesdrive!!.toDouble()*10)
    }
}
fun main(){
    val car = CarOptions("BMW",2015,1000000.0,2500,"SURESH")
    car.type = "KIA"
    println(car.milesdrive)
    println(car.owner)
    println(car.getCarPrice())

    val car2 = CarOptions("AUDI",2020,2555656.0,25210)
    println(car2.milesdrive)
    println(car2.getCarPrice())
    println(car2.owner)
}

//print list of cars
/*

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
}*/
