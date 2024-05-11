package org.d3if0093.assessment.navigation

import org.d3if0093.assessment.ui.screen.KEY_ID_PESANAN

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_PESANAN}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}