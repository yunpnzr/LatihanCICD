package com.example.latihancicd.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}