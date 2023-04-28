package com.example.booksapi.di

import com.example.booksapi.data.repository.BooksRepositoryImpl
import com.example.booksapi.domain.repo_interface.BooksRepository
import org.koin.dsl.module

val dataModule = module {
    single<BooksRepository> { BooksRepositoryImpl(get()) }
}