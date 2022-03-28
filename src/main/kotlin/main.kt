package ru.netology

fun main() {
    val amount: Int = 3500_25
    val comission: Int

    if (amount * 0.0075 > 3500) {
        comission = (amount * 0.0075).toInt()
    } else {
        comission = 3500
    }

    println("Комиссия за перевод составила $comission копеек")

}