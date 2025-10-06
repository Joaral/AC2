package com.example.androidclass4.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FraseMotivadora(
    @DrawableRes val imageResourceID: Int,
    @StringRes val stringResourceID: Int
)
