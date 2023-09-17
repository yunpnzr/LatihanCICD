package com.example.latihancicd.di

import com.example.latihancicd.data.IMessageDataSource
import com.example.latihancicd.data.MessageDataSource
import com.example.latihancicd.data.MessageRepository
import com.example.latihancicd.domain.IMessageRepository
import com.example.latihancicd.domain.MessageInteractor
import com.example.latihancicd.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
