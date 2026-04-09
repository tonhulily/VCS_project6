package com.example.vcs_project6

import androidx.lifecycle.*
import com.example.vcs_project6.data.repository.PlaceRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repo = PlaceRepository()
    private val _state = MutableLiveData<MainState>()
    val state: LiveData<MainState> = _state
    private var firstLoad = true
    fun loadData() {
        _state.value = MainState.Loading

        viewModelScope.launch {
            try {
                delay(1500)

                if (firstLoad) {
                    firstLoad = false
                    throw Exception("Lỗi tải dữ liệu")
                }

                val data = repo.fetchPlaces()
                _state.value = MainState.Success(data)

            } catch (e: Exception) {
                _state.value = MainState.Error(e.message ?: "")
            }
        }
    }
}