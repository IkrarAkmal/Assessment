package org.d3if0093.assessment.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if0093.assessment.model.Histori

class DetailViewModel: ViewModel() {
    fun getPesanan(id: Long): Histori {
        return Histori(
            id,
            "Akmal",
            "Converse Low",
            "Selesai"
        )
    }
}