import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.text.style.TextAlign
import com.aneeb.shopee.ui.theme.TextBlackColor

@Composable
fun CustomText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = TextBlackColor,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    letterSpacing: TextUnit = 0.sp,
    lineHeight: TextUnit = TextUnit.Unspecified,
    style: TextStyle? = null,
    padding: Int = 0,
    textAlign: TextAlign? = null,
) {
    Text(
        text = text,
        modifier = modifier.padding(padding.dp),
        textAlign = textAlign,
        style = style ?: TextStyle(
            fontSize = fontSize,
            fontWeight = fontWeight,
            color = color,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight

        )
    )
}