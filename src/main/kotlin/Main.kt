package ru.netology

fun main() {
    val amount = 20000
    val regularCustomer= 1 // Постоянный клиент 1. Не постоянный -1
    val discount = if (amount>10000) {
        amount * 5 /100
    } else if(amount>1000) {
        100
    }else{
        0
    }
    val result =if (regularCustomer>0) (amount - discount)-(amount-discount)/100  else amount-discount
    println("Сумма с учётом скидки: $result рублей ")
}