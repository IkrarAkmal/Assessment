package org.d3if0093.assessment.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if0093.assessment.model.Histori

class MainViewModel : ViewModel() {
    val data = getDataDummy()

    private fun getDataDummy(): List<Histori> {
        val data = mutableListOf<Histori>()
        for (i in 29 downTo 20 ){
            data.add(
                Histori(
                    i.toLong(),
                    "Akmal",
                    "Converse Low",
                    "Selesai"
                )
            )
        }
        return data
    }
}