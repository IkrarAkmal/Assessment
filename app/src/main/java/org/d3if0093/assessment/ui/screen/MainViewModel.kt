package org.d3if0093.assessment.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import org.d3if0093.assessment.database.HistoriDao
import org.d3if0093.assessment.model.Histori

class MainViewModel(dao: HistoriDao) : ViewModel() {
    val data: StateFlow<List<Histori>> = dao.getHistori().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = emptyList()
    )
}