package br.com.rubensrodrigues.baseapplication.ui.features

import android.os.Bundle
import androidx.activity.compose.setContent
import br.com.rubensrodrigues.base.ui.BaseActivity
import br.com.rubensrodrigues.baseapplication.ui.theme.MovieTheme

class MovieActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MovieTheme {
                MovieNavGraph()
            }
        }
    }
}