package com.car.maintain

class truck:CarOptions{
    /*var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesdrive:Int?=null
    var owner:String?=null*/
    var subtype:String?=null

    constructor(type:String,model:Int,price:Double,
                milesdrive:Int,owner:String,subtype:String):super(type, model, price, milesdrive, owner){
                    /*this.type = type
                    this.model = model
                    this.price = price
                    this.milesdrive = milesdrive
                    this.owner = owner*/
                    this.subtype = subtype

    }

    constructor(type:String,model:Int,price:Double,
                milesdrive:Int,subtype:String):super(type, model, price, milesdrive){
                    /*this.type = type
                    this.model = model
                    this.price = price
                    this.milesdrive = milesdrive
                    this.owner = owner*/
                    this.subtype = subtype
                }
}

fun main(){
    var car = truck("BMW", 2019, 100000.0, 5000, "rockstar" ,"garbage")
    println("===========================================================================")
    println(car.type)
    println(car.owner)
    println(car.subtype)
    println(car.milesdrive)
    println(car.getCarPrice())
    println("===========================================================================")
    println("")
    var car1 = truck("AMW", 2020, 50000.0, 110,"Marlee")
    println(car1.type)
    println(car1.subtype)
    println(car1.milesdrive)
    println(car1.getCarPrice())
    println("===========================================================================")
}