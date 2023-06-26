package com.example.mvvmbasictut.utilities

import com.example.mvvmbasictut.data.FakeDataBase
import com.example.mvvmbasictut.data.QuoteRepository
import com.example.mvvmbasictut.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDataBase.getInstance().quoteDao)
        return  QuotesViewModelFactory(quoteRepository)
    }

}