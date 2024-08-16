import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.aneeb.shopee.ui.theme.TopBarColor
import com.aneeb.shopee.ui.theme.TopBarContentColor
import com.aneeb.shopee.ui.theme.appBarInsets

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(
    title: String,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    contentColor: Color = TopBarContentColor,
    containerColor: Color = TopBarColor,
    titleTextStyle: TextStyle = MaterialTheme.typography.titleSmall,
    windowInsets: WindowInsets = appBarInsets,
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        windowInsets = windowInsets,
//        colors = TopAppBarColors(
//            containerColor = containerColor,
//            actionIconContentColor = contentColor,
//            titleContentColor = contentColor,
//            scrolledContainerColor = containerColor,
//            navigationIconContentColor = contentColor,
//        ),
        title = {
            CustomText(
                text = title,
                style = titleTextStyle,
            )
        },
        actions = actions,
        scrollBehavior = scrollBehavior,
        modifier = modifier,
        )
}