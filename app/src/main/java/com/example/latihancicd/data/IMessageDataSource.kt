package com.example.latihancicd.data

import com.example.latihancicd.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}