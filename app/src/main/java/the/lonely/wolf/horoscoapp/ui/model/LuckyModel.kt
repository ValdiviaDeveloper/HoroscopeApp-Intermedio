package the.lonely.wolf.horoscoapp.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel(
    @DrawableRes val image:Int,
    @StringRes val text:Int
)