package net.flexarch.flexcode.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import flexcode.composeapp.generated.resources.Poppins_Medium
import flexcode.composeapp.generated.resources.Res
import net.flexarch.flexcode.value.theme.onPrimaryColor
import net.flexarch.flexcode.value.theme.primaryColor
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ButtonW350(
    text: String
)
{
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(50.dp)
            .background(
                color = Color(color = primaryColor),
                shape = RoundedCornerShape(15.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "loremo",
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(resource = Res.font.Poppins_Medium)),
            color = Color(color = onPrimaryColor)
        )
    }
}