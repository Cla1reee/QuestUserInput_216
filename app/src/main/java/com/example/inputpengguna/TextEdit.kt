package com.example.inputpengguna

import androidx.compose.foundation.selection.selectable
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifer: Modifier
) {
    var textNama by remember { mutableStateOf(value"") }
    var textAlamat by remember { mutableStateOf(value"") }
    var textJK by remember { mutableStateOf(value"") }

    var nama by remember { mutableStateOf(value"") }
    var alamat by remember { mutableStateOf(value"") }
    var jenis by remember { mutableStateOf(value"") }

    val gender:List<string> = listOf("Laki-laki","Perempuan")

    column(modifer = Modifer.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
        )
    }

    val gender:List<string> = listOf("Laki-laki","Perempuan")

    column(modifer = Modifer.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it },
        )

        row {
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = { textJK = item }
                ), verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = { textJK = item }
                    )
                    Text(text = item)
            }
        }
    }

}