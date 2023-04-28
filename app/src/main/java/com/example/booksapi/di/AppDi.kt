package com.example.booksapi.di

import com.example.booksapi.presentation.vm.DetailVM
import com.example.booksapi.presentation.vm.HomeVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        HomeVM(get())
    }
    viewModel { DetailVM() }
}