package com.permuta.miprimerapantalla.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.permuta.miprimerapantalla.R
import com.permuta.miprimerapantalla.ui.CabeceraImagen
import com.permuta.miprimerapantalla.ui.CabeceraImagenData


@Composable
fun MiPrimeraPagina(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        CabeceraImagen(
            data = CabeceraImagenData(
            imagen = R.drawable.cabecera,
            onIconoIzquierdo = {},
            onIconoDerecho = {}
        ))
    }
    LazyColumn(contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)) {

    }

}

@Preview
@Composable
fun MiPrimeraPaginaPreview() {
    MaterialTheme() {
        MiPrimeraPagina()

    }
}
