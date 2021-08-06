package br.com.rubensrodrigues.network.extensions

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun <T> Flow<T>.onCollect(
    scope: CoroutineScope = CoroutineScope(Dispatchers.Default),
    onLoading: ((Boolean) -> Unit)?,
    onSuccess: ((T) -> Unit)?,
    onError: ((Throwable) -> Unit)?
) {
    scope.launch {
        onLoading?.invoke(true)
        this@onCollect
            .catch { throwable ->
                onLoading?.invoke(false)
                onError?.invoke(throwable)
            }
            .collect { response ->
                onLoading?.invoke(false)
                onSuccess?.invoke(response)
            }

    }
}