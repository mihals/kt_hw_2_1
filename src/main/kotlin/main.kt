package ru.netology

fun main() {
    val amount = 10_000_00
    val minComission = 35_00
    val percents = (amount * 0.0075).toInt()

    println(
        "Комиссия за перевод составила" +
                " ${if (percents > minComission) percents else minComission} копеек"
    )

}