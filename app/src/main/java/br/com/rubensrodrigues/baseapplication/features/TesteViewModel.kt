package br.com.rubensrodrigues.baseapplication.features

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.network.extensions.onCollect
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

@HiltViewModel
class TesteViewModel @Inject constructor() : ViewModel() {

    val testeState = mutableStateOf("")

    fun fetchTeste() {
        emitTesteModel().onCollect(
            viewModelScope,
            onLoading = {
                testeState.value = "Loading $it"
            },
            onSuccess = {
                testeState.value = it
            },
            onError = {
                testeState.value = it.message ?: "Deu ruim"
            }
        )
    }
}

fun emitTesteModel() =
    flowOf(List(100) { "Um teste ai #$it" }.random()).onStart { delay(2000) }