package com.example.androidclass4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidclass4.classes.DataLoader
import com.example.androidclass4.models.FraseMotivadora
import com.example.androidclass4.ui.theme.AndroidClass4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidClass4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun FraseMotivadorasApp(modifier:Modifier){
    val layoutDirection = LocalLayoutDirection.current
    Surface(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateEndPadding(layoutDirection),
            )
    ) {
        ListaFrasesMotivadoras(motivacionesLista = DataLoader().loadMotivationInfo())
    }

}

@Composable
fun ListaFrasesMotivadoras(motivacionesLista: List<FraseMotivadora>, modifier:Modifier = Modifier){
    LazyColumn(modifier = modifier) {
        items(motivacionesLista) {
            itemEnListaMotivacion -> FrasesMotivadorasCard(
            infoMotivacion = itemEnListaMotivacion,
            modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun FrasesMotivadorasCard(infoMotivacion: FraseMotivadora, modifier:Modifier = Modifier){
    Card(modifier = modifier){
        Column {
            Image(painterResource(id = infoMotivacion.imageResourceID),
                contentDescription = "",
            modifier = modifier
                .fillMaxWidth()
                .height(194.dp),
            contentScale = ContentScale.Crop
            )
            Text(text = stringResource(id = infoMotivacion.stringResourceID),
                modifier = Modifier.padding(16.dp))

        }
    }
}

@Preview
@Composable
fun ShowPreview(){
    FrasesMotivadorasCard(
        infoMotivacion = FraseMotivadora(
            R.drawable.paisaje1,
            R.string.frasemotivacional1),
        Modifier)
}