package com.aneeb.shopee.ui.screens.auth

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

    private val _loginState = MutableStateFlow<Result<Boolean>>(Result.success(true))
    val loginState: StateFlow<Result<Boolean>> = _loginState


    fun login(email: String, password: String) {

        viewModelScope.launch {
            val result = authRepository.login(email, password)
            _loginState.value = Result.success(true)
        }

        authRepository.login(email, password)

    }


}