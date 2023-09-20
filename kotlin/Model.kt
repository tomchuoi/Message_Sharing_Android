package com.luckyshrine.messagesharing

data class Hobby(var title: String)

object Data {
    val hobbies = listOf<Hobby>(
        Hobby("Gaming"),
        Hobby("Reading"),
        Hobby("Swimming"),
        Hobby("Running"),
        Hobby("Sleeping"),
        Hobby("Gaming"),
        Hobby("Reading"),
        Hobby("Swimming"),
        Hobby("Running"),
        Hobby("Sleeping")
    )
}