package ru.netology.profile.model

data class Profile<T : Enum<T>>(
    val id: Long,
    var login: String,
    var name: String,
    var lastName: String,
    var status: T,
    var avatar: String
) {
    val fullName
        get() = "$name $lastName"
}