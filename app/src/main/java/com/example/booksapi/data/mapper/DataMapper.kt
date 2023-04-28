package com.example.booksapi.data.mapper

interface DataMapper<T> {
    fun toDomain(): T
}