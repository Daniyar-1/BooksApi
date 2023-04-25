package com.example.booksapi.presentation.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.booksapi.R
import com.example.booksapi.presentation.models.Books

@Composable
fun HomeContent(
    listOfBooks: ArrayList<Books>,
    onBookClicked: (Books) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)

        ) {
            Text(
                text = stringResource(
                    R.string.books_title,
                ),
                color = Color.Black,
                fontSize = 28.sp,
                fontFamily = FontFamily(Font(R.font.sfprotext_bold))
            )
            Spacer(
                Modifier
                    .weight(1f)
                    .defaultMinSize(minHeight = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_search_24),
                contentDescription = stringResource(R.string.search),
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(top = 4.dp)
            )
        }
        Divider(
            color = Color.Gray, thickness = 1.dp, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp)
        )
        Row(
            modifier = Modifier.padding(4.dp)
        ) {
            Text(
                text = stringResource(R.string.sort),
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.sfprotext_bold)),
                modifier = Modifier.align(Alignment.CenterVertically),
            )
            val spinList = listOf(
                SpinModel(0, "Date"),
                SpinModel(0, "A-z"),
                SpinModel(0, "z-A")
            )

            SortSpinner(
                list = spinList,
                preselected = spinList.first(),
                onSelectionChanged = {},
                modifier = Modifier
                    .width(128.dp)
                    .padding(start = 3.dp)
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Adaptive(148.dp),
            contentPadding = PaddingValues(4.dp),
        ) {
            itemsIndexed(listOfBooks) { _, item ->
                BookItem(book = item, Modifier, onBookClicked)
            }
        }
    }
}

@Composable
fun BookItem(book: Books, modifier: Modifier = Modifier, onBookClicked: (Books) -> Unit) {
    Column(
        modifier = modifier
            .padding(horizontal = 8.dp, vertical = 12.dp)
            .fillMaxWidth()
            .defaultMinSize(minHeight = 150.dp)
            .clickable {
                onBookClicked(book)
            }
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 1.dp
            ),
        ) {
            AsyncImage(
                modifier = modifier
                    .fillMaxWidth(),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(book.imageLink?.replace("http", "https"))
                    .crossfade(true)
                    .build(),
                error = painterResource(id = R.drawable.no_image),
                placeholder = painterResource(id = R.drawable.loading),
                contentDescription = stringResource(R.string.book_image),
                contentScale = ContentScale.Crop
            )
        }

        book.title?.let {
            Text(
                text = it,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.sfprotext_medium)),
                modifier = modifier.padding(start = 10.dp)
            )
        }
    }
}