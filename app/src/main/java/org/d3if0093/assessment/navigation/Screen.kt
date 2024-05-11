package org.d3if0093.assessment.navigation

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
}