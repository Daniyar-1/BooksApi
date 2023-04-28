package com.example.booksapi.di

import com.example.booksapi.domain.use_case.GetAllBooksUseCase
import com.example.booksapi.domain.use_case.GetBookDetailUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetAllBooksUseCase(get()) }
    factory { GetBookDetailUseCase( get()) }

}