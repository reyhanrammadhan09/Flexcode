package net.flexarch.flexcode

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.flexarch.flexcode.component.ButtonW350
import net.flexarch.flexcode.value.theme.backgroudColor
import net.flexarch.flexcode.value.theme.onBackgroudColor
import net.flexarch.flexcode.value.discThiscodee
import net.flexarch.flexcode.value.gretWelcome
import net.flexarch.flexcode.value.poppinsMedium
import net.flexarch.flexcode.value.poppinsRegular
import net.flexarch.flexcode.value.subtiWorkon
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = backgroudColor))
            .padding(start = 25.dp, end = 25.dp, top = 70.dp, bottom = 50.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
    // Welcome text
        Column {
            Text(
                text = gretWelcome,
                fontSize = 31.sp,
                color = Color(color = onBackgroudColor),
                fontFamily = poppinsMedium()
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Text(
                text = subtiWorkon,
                fontSize = 25.sp,
                color = Color(color = onBackgroudColor),
                fontFamily = poppinsRegular()
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = discThiscodee,
                fontSize = 16.sp,
                color = Color(color = onBackgroudColor),
                fontFamily = poppinsRegular()
            )
        } // End from text

        ButtonW350(
            text = "Loremo"
        )
    }
}