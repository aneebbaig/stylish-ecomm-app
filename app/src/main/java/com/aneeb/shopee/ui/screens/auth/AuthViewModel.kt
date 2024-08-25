package com.aneeb.shopee.ui.screens.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.aneeb.shopee.domain.models.User
import com.aneeb.shopee.data.repository.auth.AuthRepositoryImpl
import com.aneeb.shopee.data.repository.auth.IAuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val authRepository: IAuthRepository) :
    ViewModel() {

    // Login fields
    val loginEmail = mutableStateOf(TextFieldValue(""))
    val loginPassword = mutableStateOf(TextFieldValue(""))
    val loginEmailError = mutableStateOf<String?>(null)
    val loginPasswordError = mutableStateOf<String?>(null)

    // Registration fields
    val registerFirstName = mutableStateOf(TextFieldValue(""))
    val registerLastName = mutableStateOf(TextFieldValue(""))
    val registerEmail = mutableStateOf(TextFieldValue(""))
    val registerPassword = mutableStateOf(TextFieldValue(""))
    val registerEmailError = mutableStateOf<String?>(null)
    val registerPasswordError = mutableStateOf<String?>(null)
    val registerFirstNameError = mutableStateOf<String?>(null)
    val registerLastNameError = mutableStateOf<String?>(null)


    private val _loginState = MutableStateFlow<Result<User>?>(null)
    val loginState: StateFlow<Result<User>?> = _loginState

    val isLoading = mutableStateOf(false)



    fun validateLogin() {
        loginEmailError.value =
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(loginEmail.value.text).matches()) {
                "Invalid email address"
            } else null

        loginPasswordError.value = if (loginPassword.value.text.length < 6) {
            "Password must be at least 6 characters long"
        } else null
    }

    fun validateRegister() {

        registerFirstNameError.value = if (registerFirstName.value.text.length < 2) {
            "Invalid First Name"
        } else null

        registerLastNameError.value = if (registerLastName.value.text.length < 2) {
            "Invalid Last Name"
        } else null

        registerEmailError.value =
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(registerEmail.value.text).matches()) {
                "Invalid Email Address"
            } else null

        registerPasswordError.value = if (registerPassword.value.text.length < 6) {
            "Password must be at least 6 characters long"
        } else null

    }


    fun login() {
        validateLogin()
        viewModelScope.launch {
            if (loginEmailError.value == null && loginPasswordError.value == null) {
                isLoading.value = true
                val result = authRepository.login(loginEmail.value.text, loginPassword.value.text)
                _loginState.value = result
                isLoading.value = false
            }
        }

    }

    fun register() {
        validateRegister()
        if (registerFirstNameError.value == null && registerLastNameError.value == null && registerEmailError.value == null && registerPasswordError.value == null) {
            //        viewModelScope.launch {
//            val result = authRepository.login(email, password)
//            _loginState.value = Result.success(true)
//        }
//
//        authRepository.login(email, password)
        }
    }


}