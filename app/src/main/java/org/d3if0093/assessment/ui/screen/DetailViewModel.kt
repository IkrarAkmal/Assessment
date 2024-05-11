package org.d3if0093.assessment.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if0093.assessment.database.HistoriDao
import org.d3if0093.assessment.model.Histori

class DetailViewModel(private val dao: HistoriDao): ViewModel() {
    fun insert(nama: String, jenis: String, status: String) {
        val histori = Histori(
            nama = nama,
            jenis = jenis,
            status = status
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(histori)
        }
    }
    fun getPesanan(id: Long): Histori {
        return Histori(
            id,
            "Akmal",
            "Converse Low",
            "Selesai"
        )
    }
}