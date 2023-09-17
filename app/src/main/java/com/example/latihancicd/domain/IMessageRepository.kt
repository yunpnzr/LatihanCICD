package com.example.latihancicd.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}