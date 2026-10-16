package com.example.biodataapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BiodataLayout() {
    var namaDepan by remember { mutableStateOf("") }
}