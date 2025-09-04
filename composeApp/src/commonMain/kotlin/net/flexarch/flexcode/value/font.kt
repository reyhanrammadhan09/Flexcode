package net.flexarch.flexcode.value

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import flexcode.composeapp.generated.resources.Poppins_Bold
import flexcode.composeapp.generated.resources.Poppins_Italic
import flexcode.composeapp.generated.resources.Poppins_Light
import flexcode.composeapp.generated.resources.Poppins_LightItalic
import flexcode.composeapp.generated.resources.Poppins_Medium
import flexcode.composeapp.generated.resources.Poppins_MediumItalic
import flexcode.composeapp.generated.resources.Poppins_Regular
import flexcode.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

// Poppins Thin
@Composable
fun poppinsThin() = FontFamily(
    Font(Res.font.Poppins_Light)
)
@Composable
fun poppinsThinItalic() = FontFamily(
    Font(Res.font.Poppins_LightItalic)
)


// Poppins Regular
@Composable
fun poppinsRegular() = FontFamily(
    Font(Res.font.Poppins_Regular)
)
@Composable
fun poppinsRegularItalic() = FontFamily(
    Font(Res.font.Poppins_Italic)
)


// Poppins Medium
@Composable
fun poppinsMedium() = FontFamily(
    Font(Res.font.Poppins_Medium)
)
@Composable
fun poppinsMediumItalic() = FontFamily(
    Font(Res.font.Poppins_MediumItalic)
)


// Poppins Bold
@Composable
fun poppinsBold() = FontFamily(
    Font(Res.font.Poppins_Bold)
)