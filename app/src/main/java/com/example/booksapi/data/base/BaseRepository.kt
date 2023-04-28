package com.example.booksapi.data.base

import com.example.booksapi.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

abstract class BaseRepository {

    protected fun <T> doReguest (reguest: suspend () -> T) = flow {
        emit(Resource.Loading())
        try {
            val data = reguest()
            emit(Resource.Success(data))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "g"))
        }

    }.flowOn(Dispatchers.IO)
}