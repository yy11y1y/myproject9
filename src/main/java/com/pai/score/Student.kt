package com.pai.com.pai.score

class Student(var name:String ,var english:Int ,var math:Int) {
    init {
    println("Testing")
    }
    fun print() {
        println("$name\t$english\t$math")
    }
    fun getAverage() =  (english+math)/2
}

fun main() {
    val stu = Student("Jack",55,87)
    println()
}
