package br.com.rubensrodrigues.baseapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rubensrodrigues.baseapplication.R

@Composable
fun MovieListCard() {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .padding(start = 8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.movie_or_serie_images),
            contentDescription = "",
        )
    }
}

@Preview
@Composable
fun MovieList() {
    LazyRow(
        modifier = Modifier.padding(end = 8.dp)
    ) {
        items(List(10) {}) {
            MovieListCard()
        }
    }
}

@Preview
@Composable
fun PreviewMovieListCard() {
    MovieListCard()
}