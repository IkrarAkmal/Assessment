package org.d3if0093.assessment.navigation

import org.d3if0093.assessment.ui.screen.MainScreen

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
}