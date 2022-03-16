package ru.netology

fun main() {
    val amount: Int = 35_25
    val comission: Int

    if (amount * 0.75 > 3500) {
        comission = (3500 * 0.75).toInt()
    } else {
        comission = 3500
    }

    println("Комиссия за перевод составила $comission копеек")

}