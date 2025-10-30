package com.example.inputpengguna

@Composable
fun FormDataDiri(modifer: Modifier
){
    var textNama by remember { mutableStateOf(value"") }
    var textAlamat by remember { mutableStateOf(value"") }
    var textJK by remember { mutableStateOf(value"") }

    var nama by remember { mutableStateOf(value"") }
    var alamat by remember { mutableStateOf(value"") }
    var jenis by remember { mutableStateOf(value"") }

    val gender:List<string> = listOf("Laki-laki","Perempuan")
}