package com.example.slicingbcf.implementation.peserta.worksheet_peserta

import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.slicingbcf.constant.ColorPalette
import com.example.slicingbcf.constant.StyledText
import com.example.slicingbcf.ui.animations.SubmitLoadingIndicatorDouble
import com.example.slicingbcf.ui.shared.PrimaryButton
import com.example.slicingbcf.ui.shared.message.SecondaryButton
import com.example.slicingbcf.ui.shared.textfield.CustomOutlinedTextField
import kotlinx.coroutines.delay

// TODO: RAPIHIN LAYOUT + TAMBAHIN ITEMS ITEMS LAINNYA YANG ADA DI COLUMN JUDUL DLL
@Composable
fun DetailWorksheetPesertaScreen(
  modifier : Modifier = Modifier,
  id : String
) {
  var tautanLembarKerja by remember { mutableStateOf("") }
  val onChangeTautanLembarKerja = { value : String ->
    tautanLembarKerja = value
  }
  var isLoading by remember { mutableStateOf(false) }



  Column(
    modifier = modifier.padding(
      horizontal = 16.dp,
    ),
    verticalArrangement = Arrangement.spacedBy(36.dp),
  ) {
//    Text(
//      text = "Submisi Lembar Kerja",
//      style = StyledText.MobileLargeMedium,
//      color = ColorPalette.Black,
//      modifier = Modifier.fillMaxWidth(),
//      textAlign = TextAlign.Center,
//    )
    Column(
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Text(
        text = "Judul Lembar Kerja",
        style = StyledText.MobileBaseSemibold,
        color = ColorPalette.PrimaryColor700
      )
      Text(
        text = "[Capacity Building] Hari Ke-4 Lembar Kerja - Topik: Sustainability and Sustainable Development Kerja",
        style = StyledText.MobileBaseRegular,
      )
    }
    Column(
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Text(
        text = "Judul Lembar Kerja",
        style = StyledText.MobileBaseSemibold,
        color = ColorPalette.PrimaryColor700
      )
      Text(
        text = "[Capacity Building] Hari Ke-4 Lembar Kerja - Topik: Sustainability and Sustainable Development Kerja",
        style = StyledText.MobileBaseRegular,
      )
    }
    Column(
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Text(
        text = "Tautan Lembar Kerja",
        style = StyledText.MobileBaseSemibold,
        color = ColorPalette.PrimaryColor700
      )
      Text(
        text = "bit.ly/LembarKerjaMiniTrainingDay5",
        style = StyledText.MobileBaseRegular,
        color = ColorPalette.PrimaryColor400
      )
    }
    Column(
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Text(
        text = "Batas Submisi Lembar Kerja",
        style = StyledText.MobileBaseSemibold,
        color = ColorPalette.PrimaryColor700
      )
      Text(
        text = "Selasa, 2 April 2024 13.55 WIB",
        style = StyledText.MobileBaseRegular,
      )
    }
    Column(
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Text(
        text = "Tautan Lembar Kerja Peserta",
        style = StyledText.MobileBaseSemibold,
        color = ColorPalette.PrimaryColor700
      )
      CustomOutlinedTextField(
        value = tautanLembarKerja,
        onValueChange = onChangeTautanLembarKerja,
        label = "Masukkan tautan lembar kerja",
        placeholder = "Masukkan tautan lembar kerja",
        rounded = 40,
        modifier = Modifier.fillMaxWidth(),
        )
    }
    HorizontalDivider()
    Row(
      horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {

      PrimaryButton(
        onClick = {
          isLoading = true
        },
        text = "Simpan",
        color = ColorPalette.PrimaryColor700,
        style = StyledText.MobileSmallMedium,
      )
      SecondaryButton(
        onClick = {},
        text = "Batal",
        color = ColorPalette.PrimaryColor700,
        borderColor = ColorPalette.PrimaryColor700,
      )

    }
  }
  SubmitLoadingIndicatorDouble(
    isLoading = isLoading,
    title = "Mohon Tunggu",
    titleColor = ColorPalette.PrimaryColor700,
    description = "Memproses Submisi Lembar Kerja Anda...",
    descriptionColor = ColorPalette.OnSurface,
    onAnimationFinished = {
      isLoading = false
    },
    titleBerhasil = "Lembar Kerja Anda Berhasil Dikirim!",
    titleStyle = StyledText.MobileMediumSemibold,
    descriptionStyle = StyledText.MobileSmallRegular,
    titleBerhasilStyle = StyledText.MobileMediumMedium,

  )
}