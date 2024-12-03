package edu.iesam.loginexam1eval.features.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.loginexam1eval.features.login.domain.SignInUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel (private val signInUseClass: SignInUseCase) : ViewModel() {

    fun signIn(username: String, password: String){
        viewModelScope.launch(Dispatchers.IO) {
            val response = signInUseClass.invoke(username, password)
            UiState(isSuccess = response)
            //Comunicar con LiveData
        }
    }

    data class UiState(
        val isSuccess: Boolean? = false
    )
}