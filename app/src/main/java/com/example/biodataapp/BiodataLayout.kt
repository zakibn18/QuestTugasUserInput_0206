package com.example.biodataapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BiodataLayout() {
    var namaDepan by remember { mutableStateOf("") }
    var namaBelakang by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var tglLahir by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }

    var isAndroid by remember { mutableStateOf(false) }
    var isUiUx by remember { mutableStateOf(false) }
    var isWeb by remember { mutableStateOf(false) }

    var showPopup by remember { mutableStateOf(false) }

    // State untuk DatePicker & Dropdown
    var showDatePicker by remember { mutableStateOf(false) }
    var expandedDropdown by remember { mutableStateOf(false) }
    val datePickerState = rememberDatePickerState()

    // List opsi Dropdown
    val expOptions = listOf(
        stringResource(id = R.string.exp_1_year),
        stringResource(id = R.string.exp_2_years),
        stringResource(id = R.string.exp_3_years)
    )

    // Ambil format tanggal dari strings.xml di luar blok onClick
    val datePatternString = stringResource(id = R.string.date_pattern)

    // Warna kustom Text Field
    val textFieldColors = OutlinedTextFieldDefaults.colors(
        focusedTextColor = colorResource(id = R.color.text_field_input),
        unfocusedTextColor = colorResource(id = R.color.text_field_input),
        focusedLabelColor = colorResource(id = R.color.purple_title),
        unfocusedLabelColor = colorResource(id = R.color.text_field_label),
        focusedBorderColor = colorResource(id = R.color.purple_title),
        unfocusedBorderColor = colorResource(id = R.color.text_field_border),
        focusedTrailingIconColor = colorResource(id = R.color.purple_title),
        unfocusedTrailingIconColor = colorResource(id = R.color.text_field_label)
    )
}